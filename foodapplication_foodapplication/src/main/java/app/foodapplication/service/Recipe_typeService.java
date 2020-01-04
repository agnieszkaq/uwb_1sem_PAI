package app.foodapplication.service;

import java.util.List;
import app.foodapplication.model.Recipe_type;

public interface Recipe_typeService {

	List<Recipe_type> get();

	Recipe_type get(int id);

	void save(Recipe_type recipe_type);

	void delete(int id);
}
