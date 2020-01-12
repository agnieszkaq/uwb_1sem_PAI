package app.foodapplication.service;

import java.util.List;
import app.foodapplication.model.User;

public interface UserService {
	List<User> get();

	User get(int id);

	void save(User user);

	void delete(int id);


}
