package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
