package app.foodapplication.dao;

import java.util.List;

import app.foodapplication.model.Recipe;
import app.foodapplication.model.Weight;

public interface WeightDAO {

	List<Weight> get();

	Weight get(int id);

	void save(Weight weight);

	void delete(int id);

	List<Weight> getByIdRecipe(int id);

	
}
