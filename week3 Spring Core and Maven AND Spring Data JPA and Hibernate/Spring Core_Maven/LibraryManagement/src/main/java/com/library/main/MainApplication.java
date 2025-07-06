package com.library.main;

import com.library.service.BookService;
import com.library.repository.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        // Step 3: Test DI
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
        
        BookService bookService = context.getBean("bookService", BookService.class);
        
        // Verify DI worked
        System.out.println(bookService.getBookDetails("LIB-202"));
        System.out.println("Is Repository injected? " + 
            (bookService.getBookRepository() != null));
    }
}