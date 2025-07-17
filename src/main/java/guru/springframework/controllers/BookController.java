package guru.springframework.controllers;

/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-webapp
 * @create 17/07/2025 - 22:33
 */

import guru.springframework.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    //Calling the interface, allowing to call different implementations on the road.
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookService.findAll());
        return "books";
    }
}
