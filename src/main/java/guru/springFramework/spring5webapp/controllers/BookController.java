/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springFramework.spring5webapp.controllers;

import guru.springFramework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author danie
 */
@Controller
public class BookController {
    
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    @RequestMapping("/books")
    public String getBooks(Model model){
        
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
}
