package app.foodapplication.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
		currentSession.save(weight);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
