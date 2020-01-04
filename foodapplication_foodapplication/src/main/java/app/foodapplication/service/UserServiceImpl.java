package app.foodapplication.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.foodapplication.dao.UserDAO;
import app.foodapplication.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO;
	
	@Transactional
	@Override
	public List<User> get() {
		return userDAO.get();
	}
	@Transactional
	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
