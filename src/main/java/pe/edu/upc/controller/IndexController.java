package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.upc.entity.User;
import pe.edu.upc.serviceinterface.IUserService;
import pe.edu.upc.serviceinterface.IRoleService;
import pe.edu.upc.entity.Book;
import pe.edu.upc.entity.Role;
@Controller
public class IndexController {
	@Autowired
	private IUserService cS;
	@Autowired
	private IRoleService aU;
	
	
	private Role role;
	
	
	@GetMapping
	public String home() {
		return "index";
	}
	
	
	@GetMapping("/registry")	
	public String newUser (Model model) {
		model.addAttribute("user", new User());
		role=new Role();
		model.addAttribute("role", role); //CAMBIO HECHO
		List<Role> roles = aU.list();
		model.addAttribute("roles", roles);
		return "registro";
	}
	
	@PostMapping("/registry/save")
	public String saveUser (@Validated User user, BindingResult result, Model model) throws Exception {
		if(result.hasErrors()) {
			return "registro";
		}
		
		else {
			cS.insert(user);
			//model.addAttribute("listUsers", cS.list());
			return "index";
		}
	}
	
	
	
	
	
}
