package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		Ingredient ingredientObj = ingredientService.get(id);
		if (ingredientObj == null) {
			throw new RuntimeException("The ingredient with id:" + id + " doesn't exist!");
		}
		return ingredientObj;
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
