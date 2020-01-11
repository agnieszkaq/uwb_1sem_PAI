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
import app.foodapplication.service.RecipeService;

@Controller
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

//	@GetMapping("/recipe")
//	public List<Recipe> get() {
//		return recipeService.get();
//	}

	@RequestMapping(value = { "/", "home", "/index" })
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("recipeList");
		return mav;
	}

	@GetMapping("/recipe/{id}")
	public Recipe get(@PathVariable int id) {
		Recipe recipeObj = recipeService.get(id);
		if (recipeObj == null) {
			throw new RuntimeException("The recipe with id:" + id + " doesn't exist!");
		}
		return recipeObj;
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
