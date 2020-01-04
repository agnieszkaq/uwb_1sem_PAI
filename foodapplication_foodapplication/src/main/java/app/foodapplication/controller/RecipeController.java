package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<Recipe> get(){
		return recipeService.get();
	}
}
 