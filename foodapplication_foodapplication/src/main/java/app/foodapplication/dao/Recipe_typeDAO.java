package app.foodapplication.dao;

import java.util.List;
import app.foodapplication.model.Recipe_type;
public interface Recipe_typeDAO {

	List<Recipe_type> get();

	Recipe_typeDAO get(int id);

	void save(Recipe_type recipe_type);

	void delete(int id);
}
