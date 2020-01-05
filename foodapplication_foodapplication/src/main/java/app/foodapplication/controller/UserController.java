package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.foodapplication.model.User;
import app.foodapplication.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> get() {
		return userService.get();
	}

	@GetMapping("/user/{id}")
	public User get(@PathVariable int id) {
		User userObj = userService.get(id);
		if (userObj == null) {
			throw new RuntimeException("The user with id:" + id + " doesn't exist!");
		}
		return userObj;
	}

	@PostMapping("/user")
	public User save(@RequestBody User userObj) {
		userService.save(userObj);
		return userObj;
	}

	@DeleteMapping("/user/{id}")
	public String delete(@PathVariable int id) {
		userService.delete(id);
		return "The user has been deleted with id:" + id;
	}

	@PutMapping("/user")
	public User update(@RequestBody User userObj) {
		userService.save(userObj);
		return userObj;
	}
}
