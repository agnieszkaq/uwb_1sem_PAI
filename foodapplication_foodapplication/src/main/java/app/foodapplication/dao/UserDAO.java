package app.foodapplication.dao;

import java.util.List;

import app.foodapplication.model.User;

public interface UserDAO {

	List<User> get();

	User get(int id);

	void save(User user);

	void delete(int id);

}
