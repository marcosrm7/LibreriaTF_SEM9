package pe.edu.upc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class AccountController {

	
	
	
	
	
	
	
	
	@GetMapping("/list")
	public String listAccounts (Model model) {
		return "user/listUsers";
	}
	
	
}
