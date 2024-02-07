package comt.test.hplus.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import comt.test.hplus.beans.User_;
import comt.test.hplus.repository.UserRepository;
import jakarta.validation.Valid;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserRepository userRepository;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		binder.registerCustomEditor(Date.class, "dateOfBirth", new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true) );
	}
	
	@PostMapping("/registeruser")
	public String registerUser(@Valid @ModelAttribute("newuser") User_ user_, BindingResult result, Model model ) {
		
		if(result.hasErrors()) {
			
			return "register";
		}
		
		model.addAttribute("dataSaved", "User registed successfully");
		userRepository.save(user_);
		return "login";
	}
	

}
