package app.foodapplication.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.foodapplication.dao.Recipe_commentDAO;
import app.foodapplication.model.Recipe_comment;

@Service
public class Recipe_commentServiceImpl implements Recipe_commentService {

	@Autowired
	Recipe_commentDAO recipe_commentDAO;

	@Transactional
	@Override
	public List<Recipe_comment> get() {
		return recipe_commentDAO.get();
	}

	@Transactional
	@Override
	public Recipe_comment get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void save(Recipe_comment recipe_comment) {
		recipe_commentDAO.save(recipe_comment);
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
