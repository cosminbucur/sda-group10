package com.sda.spring.boot.rest;

import com.sda.spring.boot.rest.model.Book;
import com.sda.spring.boot.rest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class SpringRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class);
    }

    @Autowired
    private BookRepository bookRepository;

    @Bean
    CommandLineRunner loadData() {
        return args -> bookRepository.saveAll(createBooks());
    }

    private List<Book> createBooks() {
        Book book = new Book();
        book.setTitle("game of thrones");
        book.setAuthor("george martin");
        book.setPublished(LocalDate.now().minusDays(20));

        return Collections.singletonList(book);
    }
}
