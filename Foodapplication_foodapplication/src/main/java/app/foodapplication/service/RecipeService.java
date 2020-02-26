package app.foodapplication.service;

import java.util.List;
import app.foodapplication.model.Recipe;

public interface RecipeService {

	List<Recipe> get();

	Recipe get(int id);

	void save(Recipe recipe);

	void delete(int id);
}
