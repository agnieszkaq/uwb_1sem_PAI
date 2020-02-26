package app.foodapplication.Login;

import app.foodapplication.model.Login;

public interface LoginDAO {

	public abstract Boolean checkLoginParameters(Login login);
}
