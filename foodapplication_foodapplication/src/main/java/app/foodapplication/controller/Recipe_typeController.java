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

import app.foodapplication.model.Recipe;
import app.foodapplication.model.Recipe_type;
import app.foodapplication.service.Recipe_typeService;

@RestController
@RequestMapping("/api")
public class Recipe_typeController {

	@Autowired
	private Recipe_typeService recipe_typeService;

	@GetMapping("/recipe_type")
	public List<Recipe_type> get() {
		return recipe_typeService.get();
	}

	@GetMapping("/recipe_type/{id}")
	public Recipe_type get(@PathVariable int id) {
		Recipe_type recipe_typeObj = recipe_typeService.get(id);
		if (recipe_typeObj == null) {
			throw new RuntimeException("The recipe_type with id:" + id + " doesn't exist!");
		}
		return recipe_typeObj;
	}

	@PostMapping("/recipe_type")
	public Recipe_type save(@RequestBody Recipe_type recipe_typeObj) {
		recipe_typeService.save(recipe_typeObj);
		return recipe_typeObj;
	}

	@DeleteMapping("/recipe_type/{id}")
	public String delete(@PathVariable int id) {
		recipe_typeService.delete(id);
		return "The recipe_type has been deleted with id:" + id;
	}

	@PutMapping("/recipe_type")
	public Recipe_type update(@RequestBody Recipe_type recipe_typeObj) {
		recipe_typeService.save(recipe_typeObj);
		return recipe_typeObj;
	}
}
