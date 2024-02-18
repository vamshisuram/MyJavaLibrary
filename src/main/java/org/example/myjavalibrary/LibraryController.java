package org.example.myjavalibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    BookRepository bookRepository;

    @PostMapping("/books")
    @ResponseBody
    public Book addNewBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/books")
    @ResponseBody
    public List<Book> getBooks() {
        List<Book> all = bookRepository.findAll();
        return all;
    }
}
