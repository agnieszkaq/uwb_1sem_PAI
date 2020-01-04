package app.foodapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.foodapplication.model.Recipe;
import app.foodapplication.model.Recipe_information;

@Repository
public class Recipe_informationDAOImpl implements Recipe_informationDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Recipe_information> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Recipe_information> query = currentSession.createQuery("from Recipe_information", Recipe_information.class);
		List<Recipe_information> list = query.getResultList();
		return list;
	}
	@Override
	public Recipe_information get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Recipe_information recipe_informationObj = currentSession.get(Recipe_information.class, id);
		return recipe_informationObj;
	}


	@Override
	public void save(app.foodapplication.model.Recipe_information recipe_information) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(recipe_information);
	}
	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Recipe_information recipe_informationObj = currentSession.get(Recipe_information.class, id);
		currentSession.delete(recipe_informationObj);
	}

}
