package com.cts.demo.controller;


import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.model.Book;
import com.cts.demo.service.BookService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;




@RestController

@RequestMapping("api/v1/book")
public class BookController {

@Autowired
private BookService bookService;
	
// http://localhost:6666/api/v1/book/saveBook

@PostMapping("/saveBook")
public Book saveBook(@RequestBody Book book)
{
    bookService.saveBook(book);
    return book;
}

//http://localhost:6666/api/v1/book/getAllBooks
@GetMapping("/getAllBooks")   	
public List<Book> getAllBooks()
{
   
    return bookService.getAllBooks();
}	

//http://localhost:6666/api/v1/book/deleteBook/1
@DeleteMapping("/deleteBook/{id}")   	
public Book deleteBook(@PathVariable int id)
{
   
    return bookService.deleteBook(id);
}	
//http://localhost:6666/api/v1/book/updateBook/2
@PutMapping("/updateBook/{id}")   	
public Book updateBook(@PathVariable int id, @RequestBody Book book)
{
   
    return bookService.updateBook(id,book);
}	


}
