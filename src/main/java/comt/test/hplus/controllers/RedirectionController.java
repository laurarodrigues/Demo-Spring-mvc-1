package comt.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectionController {
	
	@GetMapping("/redirectToLinkedIn")
	public String redirectOut(){
		
		return "redirect:https://www.linkenin.com";
	}
	

}
