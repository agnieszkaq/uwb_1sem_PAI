package app.foodapplication.controller;

import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import app.foodapplication.model.Recipe_comment;
import app.foodapplication.service.Recipe_commentService;

@Controller
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

	@RequestMapping(value = "/recipe_comment/text", method = RequestMethod.POST)
	public String getComment(@RequestParam(value = "text", required = true) String text) {
		System.out.println(text);
		Recipe_comment rc = new Recipe_comment();
		Recipe_comment recipe_commentObj = new Recipe_comment();
		recipe_commentObj.setText("ZALL");
		System.out.println(recipe_commentObj.getText());
		
		recipe_commentObj.setId(929);
		System.out.println(recipe_commentObj.getId());

		Calendar calendar = Calendar.getInstance();
		java.util.Date currentTime = calendar.getTime();
		recipe_commentObj.setDate(currentTime);
		System.out.println(recipe_commentObj.getDate());
		
		recipe_commentObj.getRecipe().setId(232);
		System.out.println(recipe_commentObj.getRecipe().getId());

		System.out.println(recipe_commentObj.getText());
		System.out.println(recipe_commentObj.getId());


		rc.setDate(currentTime);
		rc.getUser().setId(1);
		rc.getRecipe().setId(231);
		rc.setText("dupa");
		System.out.println(rc.getText());
		System.out.println(rc.getDate());
		System.out.println(rc.getRecipe().getId());
		System.out.println(rc.getUser().getUsername());

		recipe_commentService.save(rc);
		return "zrobione";
	}

	@DeleteMapping("/recipe_comment/{id}")
	public String delete(@PathVariable int id) {
		recipe_commentService.delete(id);
		return "The recipe_comment has been deleted with id:" + id;
	}

	@PutMapping("/recipe_comment")
	public Recipe_comment update(@RequestBody Recipe_comment recipe_commentObj) {
		recipe_commentService.save(recipe_commentObj);
		return recipe_commentObj;
	}
}