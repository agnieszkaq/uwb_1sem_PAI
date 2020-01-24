package app.foodapplication.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import app.foodapplication.model.Recipe;
import app.foodapplication.model.Recipe_comment;
import app.foodapplication.model.Weight;
import app.foodapplication.service.RecipeService;
import app.foodapplication.service.Recipe_commentService;
import app.foodapplication.service.WeightService;

@Controller
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	@Autowired
	private WeightService weightService;
	@Autowired
	private Recipe_commentService recipe_commentService;
	
//	@GetMapping("/recipe")
//	public List<Recipe> get() {
//		return recipeService.get();
//	}

	@RequestMapping(value = { "/recipe/list" })
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("recipeList");
		mav.addObject("recipe", recipeService.get());
		return mav;
	}

	public List<Float> calcualte(List<Weight> list) {
		float calorieSum = 0, proteinSum = 0, fatSum = 0, carbSum = 0;

		for (int i = 0; i < list.size(); i++) {
			calorieSum = calorieSum + (list.get(i).getWeight() * list.get(i).getIngredient().getCalories() / 100);
			proteinSum = proteinSum + list.get(i).getIngredient().getProtein();
			fatSum = fatSum + list.get(i).getIngredient().getFat();
			carbSum = carbSum + list.get(i).getIngredient().getCarb();
		}
		List<Float> sumList = new ArrayList<Float>();
		sumList.add(calorieSum);
		sumList.add(proteinSum);
		sumList.add(fatSum);
		sumList.add(carbSum);

		return sumList;
	}

	@RequestMapping("/recipe/list/{id}")
	public ModelAndView getById(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("recipeListByID");
		Recipe recipeObj = recipeService.get(id);
		if (recipeObj == null) {
			throw new RuntimeException("Recipe not found" + id);
		}
		mav.addObject("recipe", recipeObj);

		List<Weight> list = weightService.getByIdRecipe(id);
		mav.addObject("weight", list);

		List<Float> sumList = calcualte(list);
		DecimalFormat df = new DecimalFormat("#.0");
		mav.addObject("sumCalories", df.format(sumList.get(0)));
		mav.addObject("sumProtein", df.format(sumList.get(1)));
		mav.addObject("sumFat", df.format(sumList.get(2)));
		mav.addObject("sumCarb", df.format(sumList.get(3)));

		List<Recipe_comment> comment = recipe_commentService.getRecipeCommentByIdRecipe(id);
		mav.addObject("comment", comment);
		mav.addObject("weight", list);
		
		return mav;
	}

	@PostMapping("/recipe")
	public Recipe save(@RequestBody Recipe recipeObj) {
		recipeService.save(recipeObj);
		return recipeObj;
	}

	@DeleteMapping("/recipe/{id}")
	public String delete(@PathVariable int id) {
		recipeService.delete(id);
		return "The recipe has been deleted with id:" + id;
	}

	@PutMapping("/recipe")
	public Recipe update(@RequestBody Recipe recipeObj) {
		recipeService.save(recipeObj);
		return recipeObj;
	}

}
