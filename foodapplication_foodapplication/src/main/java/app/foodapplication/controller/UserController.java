package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.foodapplication.model.Recipe;
import app.foodapplication.model.User;
import app.foodapplication.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> get(){
		return userService.get();
	}
	@PostMapping("/user")
	public User save(@RequestBody User userObj) {
		userService.save(userObj);
		return userObj;
	}
}
 