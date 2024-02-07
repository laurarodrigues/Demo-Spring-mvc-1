package comt.test.hplus.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import comt.test.hplus.beans.Login;
import comt.test.hplus.beans.User_;
import comt.test.hplus.exception.LoginFailureException;
import comt.test.hplus.repository.UserRepository;

@RestController
public class LoginRestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/hplus/rest/loginuser")
	public ResponseEntity loginUse(@RequestBody Login login) throws LoginFailureException{
		
		User_ user = userRepository.searchByName(login.getUsername());
		if(user==null) {
			//return ResponseEntity.status(404).build();
			return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
		}
		
		if(user.getUsername().equals(login.getUsername()) && user.getPassword_().equals(login.getPassword())){
			return new ResponseEntity<>("Welcome, "+user.getUsername(), HttpStatus.OK);
		}else {
			throw new LoginFailureException("Invalid username of password");
		}
		
	}

}
