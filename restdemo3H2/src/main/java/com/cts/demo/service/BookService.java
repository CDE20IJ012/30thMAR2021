package com.cts.demo.service;

import com.cts.demo.model.Book;
import java.util.List;

public interface BookService {

	 Book saveBook(Book book);
     Book deleteBook(int bookId);
     Book updateBook(int bookId, Book book);
     List<Book> getAllBooks();
}
