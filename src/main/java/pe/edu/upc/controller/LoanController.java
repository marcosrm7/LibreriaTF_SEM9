package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.entity.Account;
import pe.edu.upc.entity.Exemplary;
import pe.edu.upc.entity.Loan;
import pe.edu.upc.serviceinterface.ILoanService;
import pe.edu.upc.serviceinterface.IExemplaryService;
import pe.edu.upc.serviceinterface.IAccountService;

@Controller
@RequestMapping("/loans")
public class LoanController {
	
	@Autowired
	private ILoanService lS;
	
	@Autowired
	private IExemplaryService eS;
	
	@Autowired
	private IAccountService aS;

	
	@GetMapping("/new")
	public String newLoan(Model model) {
		model.addAttribute("loan",new Loan());
		model.addAttribute("exemplaries",eS.list());
		model.addAttribute("accounts",aS.list());
		return "loan/loan";
	}
	
	@PostMapping("/save")
	public String saveLoan(@Validated Loan loan, BindingResult result, Model model) throws Exception{
		if (result.hasErrors()) {
			model.addAttribute("listExemplaries",eS.list());
			model.addAttribute("listAccounts",eS.list());
		
		}else {
			lS.insert(loan);
			model.addAttribute("mensaje","Prestamo se registró correctamente");
			
		}
		
		return "loan/loan";
	}
	
	
	@GetMapping("/list")
	public String listLoans(Model model) {
		try {
			model.addAttribute("listLoans", lS.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "loan/listLoans";

	}
}
