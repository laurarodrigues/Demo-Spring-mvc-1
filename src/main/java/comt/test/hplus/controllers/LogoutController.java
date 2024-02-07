package comt.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class LogoutController {
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("Ending user session");
		session.invalidate();
		return "login";
	}
}
