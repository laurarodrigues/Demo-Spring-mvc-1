package comt.test.hplus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import comt.test.hplus.beans.Login;
import comt.test.hplus.beans.User_;
import comt.test.hplus.exception.ApplicationException;
import comt.test.hplus.repository.UserRepository;

@Controller
@SessionAttributes("login")
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/login")
	public String login(@ModelAttribute("login") Login login) {
		User_ user = userRepository.searchByName(login.getUsername());
		if(user == null) {
			throw new ApplicationException("User not found");
		}
		return "forward:/userprofile";
	}
	
	
	/*@ExceptionHandler(ApplicationException.class)
	public String handleExpection() {
		
		return "error";
	}*/

}
