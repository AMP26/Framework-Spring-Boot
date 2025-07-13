package com.springboot.rest.exceptionhandling.rest;

import com.springboot.rest.exceptionhandling.entity.Book;
import com.springboot.rest.exceptionhandling.exception.BookErrorResponse;
import com.springboot.rest.exceptionhandling.exception.BookNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/book/{bookId}")
    public Book getBook(@PathVariable int bookId) {
        if(bookId >= theBooks.size() || bookId < 0) { throw new BookNotFoundException("Book ID Not Found " + bookId); }
        return theBooks.get(bookId);
    }


    @ExceptionHandler
    public ResponseEntity<BookErrorResponse> handleException(BookNotFoundException exc) {
        BookErrorResponse err = new BookErrorResponse();

        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setMessage(exc.getMessage());
        err.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<BookErrorResponse> handleException(Exception exc) {
        BookErrorResponse err = new BookErrorResponse();

        err.setStatus(HttpStatus.BAD_REQUEST.value());
//        err.setMessage(exc.getMessage());
        err.setMessage("Invalid Book ID Requested!");
        err.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
}
