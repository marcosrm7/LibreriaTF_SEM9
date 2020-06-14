package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.upc.entity.Account;
import pe.edu.upc.serviceinterface.IAccountService;
import pe.edu.upc.serviceinterface.IRoleService;
import pe.edu.upc.entity.Role;
@Controller
public class IndexController {
	@Autowired
	private IAccountService cS;
	@Autowired
	private IRoleService aU;
	
	
	private Role role;
	
	
	//@GetMapping
	@GetMapping("/")	
	public String home() {
		return "index";
	}
	
	
	@GetMapping("/registry")	
	public String newAccount (Model model) {
		model.addAttribute("account", new Account());
		role=new Role();
		model.addAttribute("role", role); //CAMBIO HECHO
		List<Role> roles = aU.list();
		model.addAttribute("roles", roles);
		return "registro";
	}
	
	@PostMapping("/registry/save")
	public String saveAccount (@Validated Account account, BindingResult result, Model model) throws Exception {
		if(result.hasErrors()) {

			model.addAttribute("roles", aU.list());
			return "registro";
		}
		
		else {
			//this.role.setIdRole(1); para despues 
			//account.setRoleAccount(role); para despues 
			cS.insert(account);
			//model.addAttribute("listUsers", cS.list());
			return "redirect:/login";
		}
	}
	/*
	@GetMapping("/login")
	public String login (Model model) {
	
		return "login";
	}*/
	
	
	
	
	
}
