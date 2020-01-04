package app.foodapplication.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.foodapplication.dao.Fav_user_recipeDAO;
import app.foodapplication.model.Fav_user_recipe;

@Service
public class Fav_user_recipeServiceImpl implements Fav_user_recipeService {

	@Autowired
	Fav_user_recipeDAO fav_user_recipeDAO;

	@Transactional
	@Override
	public List<Fav_user_recipe> get() {
		return fav_user_recipeDAO.get();
	}

	@Transactional
	@Override
	public Fav_user_recipe get(int id) {
		return fav_user_recipeDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Fav_user_recipe fav_user_recipe) {
		fav_user_recipeDAO.save(fav_user_recipe);

	}

	@Transactional
	@Override
	public void delete(int id) {
		fav_user_recipeDAO.delete(id);

	}

}
