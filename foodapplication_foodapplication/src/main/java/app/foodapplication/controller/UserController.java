package app.foodapplication.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ModelAndView save(@ModelAttribute("user") User userObj, HttpServletRequest request) {
		try {
			userService.save(userObj);

		} catch (DataIntegrityViolationException e) {
			System.out.println(e.toString());
			request.setAttribute("message", "Nazwa użytkownika już instnieje! Wpisz inna:");
			ModelAndView mavError = new ModelAndView("userAdd");
			return mavError;
		}

		ModelAndView mav = new ModelAndView("userList");
		List<User> list = userService.get();
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping("/user/update")
	public ModelAndView update(@ModelAttribute("user") User userObj, HttpServletRequest request) {
		try {
			userService.save(userObj);

		} catch (DataIntegrityViolationException e) {
			System.out.println(e.toString());
		}

		ModelAndView mav = new ModelAndView("userList");
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
