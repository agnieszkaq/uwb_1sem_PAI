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

import app.foodapplication.model.Recipe;
import app.foodapplication.model.User;
import app.foodapplication.model.Weight;
import app.foodapplication.service.RecipeService;
import app.foodapplication.service.WeightService;

@Controller
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	@Autowired
	private WeightService weightService;

//	@GetMapping("/recipe")
//	public List<Recipe> get() {
//		return recipeService.get();
//	}

	@RequestMapping(value = {"/recipe/list" })
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("recipeList");
		mav.addObject("recipe", recipeService.get());
		return mav;
	}

	@RequestMapping("/recipe/list/{id}")
	public ModelAndView getById(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("recipeListByID");
		Recipe recipeObj = recipeService.get(id);
		if (recipeObj == null) {
			throw new RuntimeException("Recipe not found" + id);
		}
		mav.addObject("recipe", recipeObj);
		
		List<Weight> list = weightService.getByIdRecipe(id);
		mav.addObject("weight", list);
		return mav;
	}
	
	
	@PostMapping("/recipe")
	public Recipe save(@RequestBody Recipe recipeObj) {
		recipeService.save(recipeObj);
		return recipeObj;
	}

	@DeleteMapping("/recipe/{id}")
	public String delete(@PathVariable int id) {
		recipeService.delete(id);
		return "The recipe has been deleted with id:" + id;
	}

	@PutMapping("/recipe")
	public Recipe update(@RequestBody Recipe recipeObj) {
		recipeService.save(recipeObj);
		return recipeObj;
	}

}
