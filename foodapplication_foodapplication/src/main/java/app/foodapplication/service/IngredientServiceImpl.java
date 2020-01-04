package app.foodapplication.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.foodapplication.dao.IngredientDAO;
import app.foodapplication.model.Ingredient;

@Service
public class IngredientServiceImpl implements IngredientService {

	@Autowired
	IngredientDAO ingredientDAO;

	@Transactional
	@Override
	public List<Ingredient> get() {
		return ingredientDAO.get();
	}

	@Transactional
	@Override
	public Ingredient get(int id) {
		return ingredientDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Ingredient ingredient) {
		ingredientDAO.save(ingredient);
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
