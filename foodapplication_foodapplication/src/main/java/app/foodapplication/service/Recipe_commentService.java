package app.foodapplication.service;

import java.util.List;

import app.foodapplication.model.Recipe_comment;

public interface Recipe_commentService {
	List<Recipe_comment> get();

	Recipe_comment get(int id);

	void save(Recipe_comment recipe_comment);

	void delete(int id);

	List<Recipe_comment> getRecipeCommentByIdRecipe(int id);
}
