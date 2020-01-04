package app.foodapplication.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import app.foodapplication.model.Fav_user_recipe;

@Repository
public class Fav_user_recipeDAOImpl implements Fav_user_recipeDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Fav_user_recipe> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Fav_user_recipe> query = currentSession.createQuery("from Fav_user_recipe", Fav_user_recipe.class);
		List<Fav_user_recipe> list = query.getResultList();
		return list;
	}

	@Override
	public Fav_user_recipe get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Fav_user_recipe fav_user_recipe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}
}
