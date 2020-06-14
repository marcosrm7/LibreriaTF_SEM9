package pe.edu.upc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pe.edu.upc.entity.Author;
import pe.edu.upc.entity.Book;
import pe.edu.upc.serviceinterface.IAuthorService;
import pe.edu.upc.serviceinterface.IBookService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	private IBookService cS;
	@Autowired
	private IAuthorService aU;

	private Author author;

	@GetMapping("/new")
	public String newBook(Model model) {
		model.addAttribute("book", new Book());
		author = new Author();
		model.addAttribute("author", author); // CAMBIO HECHO
		List<Author> authors = aU.list();
		model.addAttribute("authors", authors);
		return "book/book";
	}

	@PostMapping("/save")
	public String saveBook(@Validated Book book, BindingResult result, Model model) throws Exception {
		if (result.hasErrors()) {
			List<Author> authors = aU.list();
			model.addAttribute("authors", authors);
			return "book/book";
		} else {
			cS.insert(book);
			model.addAttribute("listBooks", cS.list());
			return "book/listBooks";
		}
	}

	@GetMapping("/list")
	public String listBooks(Model model) {
		try {
			model.addAttribute("listBooks", cS.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "book/listBooks";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteBook(Model model, @PathVariable(value = "id") int id) {
		try {
			if (id > 0) {
				cS.delete(id);
			}
			model.addAttribute("mensaje", "Se eliminó correctamente");
		} catch (Exception e) {
			model.addAttribute("mensaje", "Ocurrió un error, no se pudo eliminar");
		}
		model.addAttribute("listBooks", cS.list());
		return "redirect:/books/list";// Mod pq con el buscar no funcaba
	}
	
	@RequestMapping("/irupdate/{id}")
	public String irupdate(@PathVariable int id, Model model, RedirectAttributes objRedir) {
		Optional<Book> objBook = cS.searchId(id);
		if (objBook == null) {
			objRedir.addFlashAttribute("mensaje", "Ocurrió un error");
			return "redirect:/books/list";
		} else {
			model.addAttribute("listBooks", cS.list());// OJO A LO QUE DICE LA PROFESORA
			model.addAttribute("authors",aU.list());
			model.addAttribute("book", objBook.get());
			return "book/book";
		}
	}
	
	
	
	

}
