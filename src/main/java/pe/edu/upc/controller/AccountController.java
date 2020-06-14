package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.entity.Account;
import pe.edu.upc.serviceinterface.IAccountService;
import pe.edu.upc.serviceinterface.IRoleService;

@Controller
@RequestMapping("/users")
@Secured("ROLE_ADMIN")
public class AccountController {

	@Autowired
	private IAccountService cS;
	@Autowired
	private IRoleService rS;
	@GetMapping("/list")
	public String listAccounts (Model model) {
		
		
		try {
			model.addAttribute("listAccounts", cS.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "user/listUsers";
	}
	@GetMapping("/new")	
	public String newAccount (Model model) {
		model.addAttribute("account", new Account());
	
		model.addAttribute("roles", rS.list());
		return "user/user";
	}
	
	@PostMapping("/save")
	public String saveAccount (@Validated Account account, BindingResult result, Model model) throws Exception {
		if(result.hasErrors()) {
			model.addAttribute("roles", rS.list());
			return "user/user";
		}
		
		else {
			String password = new BCryptPasswordEncoder().encode(account.getPasswordAccount());
			account.setPasswordAccount(password);
			cS.insert(account);
			model.addAttribute("listAccounts", cS.list());
			return "user/listUsers";
		}
	}
	
	
	
	
	
	
}
