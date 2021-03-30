package com.cts.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.demo.dao.BookRepository;
import com.cts.demo.model.Book;

// CRUD
@Service
public class BookServiceImpl implements BookService {

	
	@Autowired
	private BookRepository bookRepository;
	
	
	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public Book deleteBook(int bookId) {
                Optional<Book> searchBook=bookRepository.findById(bookId);
                Book found=null;
                if(searchBook.isPresent())
                 {
                     found=searchBook.get();
                     bookRepository.delete(found);
                 }
		
		return found;
	}

	@Override
	public Book updateBook(int bookId, Book book) {
		Optional<Book> searchBook=bookRepository.findById(bookId);
                Book found=null;
                if(searchBook.isPresent())
                 {
                     found=searchBook.get();
                     bookRepository.save(book);
                 }
		
		return found;
	}

	@Override
	public List<Book> getAllBooks() {
	   List<Book>   bookList=bookRepository.findAll();
		return bookList;
	}

}

