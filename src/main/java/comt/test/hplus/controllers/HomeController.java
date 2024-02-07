package comt.test.hplus.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import comt.test.hplus.beans.Login;
import comt.test.hplus.beans.User_;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String goHome() {
		System.out.println("in home controller");
		return "index";
	}
	
	@GetMapping("/goToSearch")
	public String goToSeach() {
		System.out.println("going to search");
		return "search";
	}
	
	@GetMapping("/goToLogin")
	public String goToLogin() {
		return "login";
	}
	
	
	@GetMapping("/goToRegister")
	public String goToRegister() {
		return "register";
	}
	
	/*@ModelAttribute("newuser")
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
	}*/
	
	
}
