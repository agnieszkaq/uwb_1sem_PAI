package app.foodapplication.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


public class LoginController {

	@RequestMapping(value = { "/" })
	public ModelAndView showUser() {
		ModelAndView mav = new ModelAndView("index");

		return mav;
	}
}
