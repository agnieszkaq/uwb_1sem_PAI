package app.foodapplication.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.foodapplication.dao.Recipe_informationDAO;
import app.foodapplication.model.Recipe_information;

@Service
public class Recipe_informationServiceImpl implements Recipe_informationService {

	@Autowired
	Recipe_informationDAO recipe_informationDAO;
	
	@Transactional
	@Override
	public List<Recipe_information> get() {
		return recipe_informationDAO.get();
	}
	@Transactional
	@Override
	public Recipe_information get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(Recipe_information recipe_information) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
