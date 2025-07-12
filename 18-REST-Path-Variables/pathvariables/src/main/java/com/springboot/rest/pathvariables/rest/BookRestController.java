package com.springboot.rest.pathvariables.rest;

import com.springboot.rest.pathvariables.entity.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookRestController {
    private List<Book> theBooks;

    @PostConstruct
    public void loadData() {
        theBooks = new ArrayList<>();
        theBooks.add(new Book("The Silent Forest", "Olivia Harper", "978-0-123456-00-1", new BigDecimal("299")));
        theBooks.add(new Book("Beyond the Horizon", "Liam Anderson", "978-0-123456-01-8", new BigDecimal("399")));
        theBooks.add(new Book("Tales from the Attic", "Sophia Bennett", "9978-0-123456-02-5", new BigDecimal("249")));
    }

    @GetMapping("/books")
    public List<Book> getBooks() { return theBooks; }

    @GetMapping("/books/{bookId}")
    public Book getBook(@PathVariable int bookId) {
        return theBooks.get(bookId);
    }
}
