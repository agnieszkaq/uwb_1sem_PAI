package app.foodapplication.service;

import java.util.List;

import app.foodapplication.model.Ingredient;

public interface IngredientService {
	List<Ingredient> get();

	Ingredient get(int id);

	void save(Ingredient ingredient);

	void delete(int id);
	
	List<Ingredient> groupByType();

	List<Ingredient> getByType(String ingredientType);
}
