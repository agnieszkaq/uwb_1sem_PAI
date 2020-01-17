package app.foodapplication.Login;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.MidiDevice.Info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import app.foodapplication.model.Login;
import app.foodapplication.model.User;

@Controller
public class LoginController extends HttpServlet {
	
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = { "/sign" })
	public ModelAndView showLoginFormy() {
		ModelAndView mav = new ModelAndView("signIn");
		mav.addObject("login", new Login());
		return mav;
	}

}
