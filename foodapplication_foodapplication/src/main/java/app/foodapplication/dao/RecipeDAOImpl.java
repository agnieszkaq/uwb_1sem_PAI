package app.foodapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import app.foodapplication.model.Recipe;

@Repository
public class RecipeDAOImpl implements RecipeDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Recipe> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Recipe> query = currentSession.createQuery("from Recipe", Recipe.class);
		List<Recipe> list = query.getResultList();
		return list;
	}

	@Override
	public Recipe get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Recipe recipeObj = currentSession.get(Recipe.class, id);
		return recipeObj;
	}

	@Override
	public void save(Recipe recipe) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(recipe);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Recipe recipeObj = currentSession.get(Recipe.class, id);
		currentSession.delete(recipeObj);
	}
}
