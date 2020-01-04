package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import app.foodapplication.model.Recipe_type;
import app.foodapplication.service.Recipe_typeService;

@RestController
@RequestMapping("/api")
public class Recipe_typeController {

	@Autowired
	private Recipe_typeService recipe_typeService;
	
	@GetMapping("/recipe_type")
	public List<Recipe_type> get(){
		return recipe_typeService.get();
	}
}
 