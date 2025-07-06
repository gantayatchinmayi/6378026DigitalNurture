package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBookDetails(String bookId) {
        return bookRepository.findBookById(bookId);
    }
    public BookRepository getBookRepository() {
        return bookRepository;
    }
}