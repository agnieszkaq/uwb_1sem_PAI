package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import app.foodapplication.model.Recipe;
import app.foodapplication.service.RecipeService;

@RestController
@RequestMapping("/api")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@GetMapping("/recipe")
	public List<Recipe> get() {
		return recipeService.get();
	}

	@GetMapping("/recipe/{id}")
	public Recipe get(@PathVariable int id) {
		return recipeService.get(id);
	}
	
	@PostMapping("/recipe")
	public Recipe save(@RequestBody Recipe recipeObj) {
		recipeService.save(recipeObj);
		return recipeObj;
	}
}
