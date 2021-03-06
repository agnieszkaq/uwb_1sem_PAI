package app.foodapplication.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.foodapplication.dao.Recipe_typeDAO;
import app.foodapplication.model.Recipe_type;

@Service
public class Recipe_typeServiceImpl implements Recipe_typeService {

	@Autowired
	Recipe_typeDAO recipe_typeDAO;

	@Transactional
	@Override
	public List<Recipe_type> get() {
		return recipe_typeDAO.get();
	}

	@Transactional
	@Override
	public Recipe_type get(int id) {
		return recipe_typeDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Recipe_type recipe_type) {
		recipe_typeDAO.save(recipe_type);
	}

	@Transactional
	@Override
	public void delete(int id) {
		recipe_typeDAO.delete(id);

	}

}