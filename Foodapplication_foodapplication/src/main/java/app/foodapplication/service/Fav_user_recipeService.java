package app.foodapplication.service;

import java.util.List;

import app.foodapplication.model.Fav_user_recipe;

public interface Fav_user_recipeService {
	List<Fav_user_recipe> get();

	Fav_user_recipe get(int id);

	void save(Fav_user_recipe fav_user_recipe);

	void delete(int id);
}
