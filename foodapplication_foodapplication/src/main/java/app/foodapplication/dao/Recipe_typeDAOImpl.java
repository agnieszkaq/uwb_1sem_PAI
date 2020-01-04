package app.foodapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import app.foodapplication.model.Recipe_type;

@Repository
public class Recipe_typeDAOImpl implements Recipe_typeDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Recipe_type> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Recipe_type> query = currentSession.createQuery("from Recipe_type", Recipe_type.class);
		List<Recipe_type> list = query.getResultList();
		return list;
	}

	@Override
	public Recipe_typeDAO get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Recipe_type recipe_type) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(recipe_type);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
