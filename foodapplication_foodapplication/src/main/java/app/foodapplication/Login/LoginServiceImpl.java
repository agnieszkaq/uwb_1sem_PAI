package app.foodapplication.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.foodapplication.model.Login;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;

	@Override
	public Boolean isCorrect(Login log) {
		return loginDAO.checkLoginParameters(log);
	}
}
