package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.entity.Book;
import pe.edu.upc.entity.Exemplary;
import pe.edu.upc.serviceinterface.IBookService;
import pe.edu.upc.serviceinterface.IExemplaryService;


@Controller
@RequestMapping("/books/exemplaries")
public class ExemplaryController {
	@Autowired
	private IExemplaryService cS;
	@Autowired
	private IBookService aU;
	
	
	private Book book;
	
	
	@GetMapping("/new")
	public String newExemplary (Model model) {
		model.addAttribute("exemplary", new Exemplary());
		book=new Book();
		model.addAttribute("book", book); 
		List<Book> books = aU.list();
		model.addAttribute("books", books);
		return "book/exemplary";
	}
	
	@PostMapping("/save")
	public String saveExemplary (@Validated Exemplary exemplary, BindingResult result, Model model) throws Exception {
		//int contador=exemplary.getCountExemplary();
		if(result.hasErrors()) {
			return "book/exemplary";
		}
		
		else {	
		
			cS.insert(exemplary);
			
			model.addAttribute("listExemplaries", cS.list());
			//model.addAttribute("listBooks", aU.list());
			return "book/listExemplaries";
		}
	}
	
	
	@GetMapping("/list")
	public String listExemplaries(Model model) {
		try {
			model.addAttribute("listExemplaries", cS.list());
		}catch(Exception e) {
			model.addAttribute("error",e.getMessage());
		}
		return "book/listExemplaries";
	}
	
	
	
	
	
	
	
	
}
