package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.foodapplication.model.Ingredient;
import app.foodapplication.service.IngredientService;

@RestController
@RequestMapping("/api")
public class IngredientController {
	@Autowired
	private IngredientService ingredientService;

	@GetMapping("/ingredient")
	public List<Ingredient> get() {
		return ingredientService.get();
	}
	
	@GetMapping("/ingredient/{id}")
	public Ingredient get(@PathVariable int id) {
		return ingredientService.get(id);
	}
	
	@PostMapping("/ingredient")
	public Ingredient save(@RequestBody Ingredient ingredientObj) {
		ingredientService.save(ingredientObj);
		return ingredientObj;
	}
}
