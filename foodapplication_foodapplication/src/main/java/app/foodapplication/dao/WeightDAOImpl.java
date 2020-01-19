package app.foodapplication.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.foodapplication.model.Ingredient;
import app.foodapplication.model.Recipe;
import app.foodapplication.model.Weight;
import app.foodapplication.model.Weight;

@Repository
public class WeightDAOImpl implements WeightDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Weight> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Weight> query = currentSession.createQuery("from Weight", Weight.class);
		List<Weight> list = query.getResultList();
		return list;
	}

	@Override
	public Weight get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Weight weightObj = currentSession.get(Weight.class, id);
		return weightObj;
	}

	@Override
	public void save(Weight weight) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(weight);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Weight weightObj = currentSession.get(Weight.class, id);
		currentSession.delete(weightObj);
	}

	@Override
	public List<Weight> getByIdRecipe(int id) {
		String sql = "select w from Weight w where w.recipe.id = '" + id + "'";
		List<Weight> list = entityManager.createQuery(sql, Weight.class).getResultList();
		return (List<Weight>) list;
	}
}
