package app.foodapplication.Login;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import app.foodapplication.model.Login;
import app.foodapplication.model.User;

@Repository
@Transactional
public class LoginDAOImpl implements LoginDAO {

	@PersistenceContext
	private EntityManager entity;

	@Override
	public Boolean checkLoginParameters(Login login) {
		String sql = "select u from User u where u.username='" + login.getUsername() + "' AND u.password='"
				+ login.getUsername() + "'";
		List<?> list = entity.createQuery(sql, User.class).getResultList();
		if (list.isEmpty()) {
			return false;
		}
		return true;
	}
}
