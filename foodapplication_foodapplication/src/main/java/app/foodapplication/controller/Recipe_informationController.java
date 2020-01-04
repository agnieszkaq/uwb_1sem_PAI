package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.foodapplication.model.Recipe_information;
import app.foodapplication.service.Recipe_informationService;

@RestController
@RequestMapping("/api")
public class Recipe_informationController {
	@Autowired
	private Recipe_informationService recipe_informationService;

	@GetMapping("/recipe_information")
	public List<Recipe_information> get() {
		return recipe_informationService.get();
	}
}