package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String newAuthor(Model model) {
		model.addAttribute("author", new Author());
		return "author/author";
	}

	@PostMapping("/save")
	public String saveAuthor(@Validated Author author, BindingResult result, Model model) throws Exception {
		if (result.hasErrors()) {
			return "author/author";
		} else {
			int rpta = cS.insert(author);
			if (rpta > 0) {
				model.addAttribute("mensaje", "Ya existe");
				return "author/author";
			} else {
				model.addAttribute("listAuthors", cS.list());
				return "author/listAuthors";
			}
		}
	}

	@GetMapping("/list")
	public String listAuthors(Model model) {
		try {
			model.addAttribute("listAuthors", cS.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "author/listAuthors";
	}

	@RequestMapping("/delete/{id}")
	public String deleteAuthor(Model model, @PathVariable(value = "id") int id) {
		try {
			if (id > 0) {
				cS.delete(id);
			}
			model.addAttribute("mensaje", "Se eliminó correctamente");
		} catch (Exception e) {
			model.addAttribute("mensaje", "Ocurrió un error, no se pudo eliminar");
		}
		model.addAttribute("listAuthors", cS.list());
		return "redirect:/authors/list";//Mod pq con el buscar no funcaba
	}
}
