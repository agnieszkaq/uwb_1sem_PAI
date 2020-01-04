package app.foodapplication.dao;

import java.util.List;
import app.foodapplication.model.Recipe_comment;

public interface Recipe_commentDAO {

	List<Recipe_comment> get();

	Recipe_comment get(int id);

	void save(Recipe_comment recipe_comment);

	void delete(int id);
}
