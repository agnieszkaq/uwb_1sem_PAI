package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import app.foodapplication.model.User;
import app.foodapplication.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/user/list" })
	public ModelAndView showUser() {
		ModelAndView mav = new ModelAndView("userList");
		List<User> list = userService.get();
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping(value = { "/user/add" })
	public ModelAndView showUserRegistry() {
		ModelAndView mav = new ModelAndView("userAdd");
		mav.addObject("user", new User());
		return mav;
	}

	@RequestMapping("/user/save")
	public ModelAndView save(@ModelAttribute("user") User userObj) {
		ModelAndView mav = new ModelAndView("userList");
		userService.save(userObj);
		List<User> list = userService.get();
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping("/user/edit/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("userEdit");
		User userObj = userService.get(id);
		if (userObj == null) {
			throw new RuntimeException("User not found" + id);
		}
		mav.addObject("user", userObj);
		return mav;
	}

	@RequestMapping("/user/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("userList");
		userService.delete(id);
		List<User> list = userService.get();
		mav.addObject("list", list);
		return mav;
	}

}
