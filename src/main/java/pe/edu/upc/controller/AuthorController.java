package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.entity.Author;
import pe.edu.upc.serviceinterface.IAuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {
	@Autowired
	private IAuthorService cS;
	
	
	@GetMapping("/new")
	public String newAuthor (Model model) {
		model.addAttribute("author", new Author());
		return "author/author";
	}
	
	@PostMapping("/save")
	public String saveAuthor (@Validated Author author, BindingResult result, Model model) throws Exception {
		if(result.hasErrors()) {
			return "author/author";
		}
		
		else {
			cS.insert(author);
			model.addAttribute("listAuthors", cS.list());
			return "author/listAuthors";
		}
	}
	
	@GetMapping("/list")
	public String listAuthors(Model model) {
		try {
			model.addAttribute("listAuthors", cS.list());
		}catch(Exception e) {
			model.addAttribute("error",e.getMessage());
		}
		return "author/listAuthors";
	}
	
	
	
	
	
	
	
	
	
}
