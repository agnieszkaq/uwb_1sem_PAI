package app.foodapplication.service;

import java.util.List;

import app.foodapplication.model.Recipe_information;

public interface Recipe_informationService {
	List<Recipe_information> get();

	Recipe_information get(int id);

	void save(Recipe_information recipe_information);

	void delete(int id);

}
