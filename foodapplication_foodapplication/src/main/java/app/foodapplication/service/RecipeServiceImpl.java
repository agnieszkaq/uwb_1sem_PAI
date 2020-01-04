package app.foodapplication.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.foodapplication.dao.RecipeDAO;
import app.foodapplication.model.Recipe;

@Service
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	RecipeDAO recipeDAO;

	@Transactional
	@Override
	public List<Recipe> get() {
		return recipeDAO.get();
	}

	@Transactional
	@Override
	public Recipe get(int id) {
		return recipeDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Recipe recipe) {
		recipeDAO.save(recipe);
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
