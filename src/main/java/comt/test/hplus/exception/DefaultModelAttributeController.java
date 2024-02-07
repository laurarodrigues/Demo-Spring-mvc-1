package comt.test.hplus.exception;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import comt.test.hplus.beans.Login;
import comt.test.hplus.beans.User_;

@ControllerAdvice
public class DefaultModelAttributeController {
	
	@ModelAttribute("newuser")
	public User_ getDefaultUser() {
		return new User_();
	}
	
	@ModelAttribute("genderItems")
	public List<String> getGenderItems(){
		return Arrays.asList(new String[] {"Male","Female","Other"});
	}
	
	@ModelAttribute("login")
	public Login getDefaultLogin() {
		return new Login();
	}

}
