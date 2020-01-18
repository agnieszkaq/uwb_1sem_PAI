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
		Session currentSession = entityManager.unwrap(Session.class);
		Ingredient ingredientObj = currentSession.get(Ingredient.class, id);
		return ingredientObj;
	}

	@Override
	public void save(Ingredient ingredient) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(ingredient);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Ingredient ingredientObj = currentSession.get(Ingredient.class, id);
		currentSession.delete(ingredientObj);
	}

	@Override
	public List<Ingredient> groupByType() {
		String sql = "Select i FROM Ingredient i group by i.ingredient_type";
		List<Ingredient> list = entityManager.createQuery(sql, Ingredient.class).getResultList();
		return (List<Ingredient>) list;
	}

	@Override
	public List<Ingredient> getByType(String ingredient_type) {
		String sql = "select u from Ingredient u where u.ingredient_type='" + ingredient_type + "'";
		List<Ingredient> list = entityManager.createQuery(sql, Ingredient.class).getResultList();
		return (List<Ingredient>) list;
	}

}
