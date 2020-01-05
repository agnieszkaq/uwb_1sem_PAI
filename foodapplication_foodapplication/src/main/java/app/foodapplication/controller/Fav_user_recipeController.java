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

import app.foodapplication.model.Fav_user_recipe;
import app.foodapplication.model.Recipe;
import app.foodapplication.service.Fav_user_recipeService;

@RestController
@RequestMapping("/api")
public class Fav_user_recipeController {

	@Autowired
	private Fav_user_recipeService fav_user_recipeService;

	@GetMapping("/fav_user_recipe")
	public List<Fav_user_recipe> get() {
		return fav_user_recipeService.get();
	}

	@GetMapping("/fav_user_recipe/{id}")
	public Fav_user_recipe get(@PathVariable int id) {
		Fav_user_recipe fav_user_recipeObj = fav_user_recipeService.get(id);
		if (fav_user_recipeObj == null) {
			throw new RuntimeException("The fav_user_recipe with id:" + id + " doesn't exist!");
		}
		return fav_user_recipeObj;
	}

	@PostMapping("/fav_user_recipe")
	public Fav_user_recipe save(@RequestBody Fav_user_recipe fav_user_recipeObj) {
		fav_user_recipeService.save(fav_user_recipeObj);
		return fav_user_recipeObj;
	}

	@DeleteMapping("/fav_user_recipe/{id}")
	public String delete(@PathVariable int id) {
		fav_user_recipeService.delete(id);
		return "The fav_user_recipe has been deleted with id:" + id;
	}

	@PutMapping("/fav_user_recipe")
	public Fav_user_recipe update(@RequestBody Fav_user_recipe fav_user_recipeObj) {
		fav_user_recipeService.save(fav_user_recipeObj);
		return fav_user_recipeObj;
	}
}
