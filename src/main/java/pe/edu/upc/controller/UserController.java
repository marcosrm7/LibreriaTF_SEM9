package pe.edu.upc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

	
	
	
	
	
	
	
	
	@GetMapping("/list")
	public String listUsers (Model model) {
		return "user/listUsers";
	}
}
