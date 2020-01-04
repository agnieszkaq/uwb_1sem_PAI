package app.foodapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import app.foodapplication.model.Ingredient;

@Repository
public class IngredientDAOImpl implements IngredientDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Ingredient> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Ingredient> query = currentSession.createQuery("from Ingredient", Ingredient.class);
		List<Ingredient> list = query.getResultList();
		return list;
	}

	@Override
	public Ingredient get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Ingredient ingredient) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(ingredient);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
