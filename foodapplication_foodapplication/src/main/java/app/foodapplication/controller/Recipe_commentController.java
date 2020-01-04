package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.foodapplication.model.Recipe_comment;
import app.foodapplication.service.Recipe_commentService;

@RestController
@RequestMapping("/api")
public class Recipe_commentController {
	@Autowired
	private Recipe_commentService recipe_commentService;

	@GetMapping("/recipe_comment")
	public List<Recipe_comment> get() {
		return recipe_commentService.get();
	}

	@GetMapping("/recipe_comment/{id}")
	public Recipe_comment get(@PathVariable int id) {
		Recipe_comment recipe_commentObj = recipe_commentService.get(id);
		if (recipe_commentObj == null) {
			throw new RuntimeException("The recipe_comment with id:" + id + " doesn't exist!");
		}
		return recipe_commentObj;
	}

	@PostMapping("/recipe_comment")
	public Recipe_comment save(@RequestBody Recipe_comment recipe_commentObj) {
		recipe_commentService.save(recipe_commentObj);
		return recipe_commentObj;
	}

	@DeleteMapping("/recipe_comment/{id}")
	public String delete(@PathVariable int id) {
		recipe_commentService.delete(id);
		return "The recipe_comment has been deleted with id:" + id;
	}
}