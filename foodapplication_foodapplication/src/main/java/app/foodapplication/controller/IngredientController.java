package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import app.foodapplication.model.Ingredient;
import app.foodapplication.model.User;
import app.foodapplication.service.IngredientService;

@Controller
public class IngredientController {
	@Autowired
	private IngredientService ingredientService;

//	@GetMapping("/ingredient")
//	public List<Ingredient> get() {
//		return ingredientService.get();
//	}

	@GetMapping("/ingredient/{id}")
	public Ingredient get(@PathVariable int id) {
		Ingredient ingredientObj = ingredientService.get(id);
		if (ingredientObj == null) {
			throw new RuntimeException("The ingredient with id:" + id + " doesn't exist!");
		}
		return ingredientObj;
	}

	@GetMapping("/ingredient/list/{ingredient_type}")
	public ModelAndView getByType(@PathVariable String ingredient_type) {
		List<Ingredient> list = ingredientService.getByType(ingredient_type);
		if (list == null) {
			throw new RuntimeException("Problem with ingredient!");
		}
		ModelAndView mav = new ModelAndView("ingredientListByType");
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping("/ingredient/category")
	public ModelAndView groupByType() {
		ModelAndView mav = new ModelAndView("ingredientType");
		List<Ingredient> list = ingredientService.groupByType();
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping(value = { "/ingredient/list" })
	public ModelAndView showIngredient() {
		ModelAndView mav = new ModelAndView("ingredientList");
		mav.addObject("ingredient", ingredientService.get());
		return mav;
	}

	@PostMapping("/ingredient")
	public Ingredient save(@RequestBody Ingredient ingredientObj) {
		ingredientService.save(ingredientObj);
		return ingredientObj;
	}

	@DeleteMapping("/ingredient/{id}")
	public String delete(@PathVariable int id) {
		ingredientService.delete(id);
		return "The ingredient has been deleted with id:" + id;
	}

	@PutMapping("/ingredient")
	public Ingredient update(@RequestBody Ingredient ingredientObj) {
		ingredientService.save(ingredientObj);
		return ingredientObj;
	}
}
