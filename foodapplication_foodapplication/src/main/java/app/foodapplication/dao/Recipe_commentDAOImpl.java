package app.foodapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.foodapplication.model.Recipe;
import app.foodapplication.model.Recipe_comment;

@Repository
public class Recipe_commentDAOImpl implements Recipe_commentDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Recipe_comment> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Recipe_comment> query = currentSession.createQuery("from Recipe_comment", Recipe_comment.class);
		List<Recipe_comment> list = query.getResultList();
		return list;
	}

	@Override
	public Recipe_comment get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Recipe_comment recipe_commentObj = currentSession.get(Recipe_comment.class, id);
		return recipe_commentObj;
	}

	@Override
	public void save(Recipe_comment recipe_comment) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(recipe_comment);

	}
	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Recipe_comment recipe_commentObj = currentSession.get(Recipe_comment.class, id);
		currentSession.delete(recipe_commentObj);
	}

}
