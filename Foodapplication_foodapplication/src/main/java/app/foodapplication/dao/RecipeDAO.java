package app.foodapplication.dao;

import java.util.List;
import app.foodapplication.model.Recipe;

public interface RecipeDAO {

	List<Recipe> get();

	Recipe get(int id);

	void save(Recipe recipe);

	void delete(int id);
	
}
