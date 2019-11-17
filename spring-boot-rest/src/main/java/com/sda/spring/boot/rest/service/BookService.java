package com.sda.spring.boot.rest.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.spring.boot.rest.dto.BookMapper;
import com.sda.spring.boot.rest.dto.BookRequest;
import com.sda.spring.boot.rest.dto.BookResponse;
import com.sda.spring.boot.rest.exception.NotFoundException;
import com.sda.spring.boot.rest.model.Book;
import com.sda.spring.boot.rest.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BookService {

    private static final Logger log = LoggerFactory.getLogger(BookService.class);

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;
    private final ObjectMapper jacksonObjectMapper;

    @Autowired
    public BookService(BookRepository bookRepository, BookMapper bookMapper, ObjectMapper jacksonObjectMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
        this.jacksonObjectMapper = jacksonObjectMapper;
    }

    // find all
    public List<BookResponse> findAll() {
        log.info("finding all books");

        List<Book> books = bookRepository.findAll();
        return bookMapper.toDtos(books);
    }

    // find by id
    public BookResponse findById(long id) {
        log.info("finding book by id: {}", id);

        // find if exists
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("book not found"));

        // convert
        return bookMapper.toDto(book);
    }

    // save
    public BookResponse save(BookRequest createBookRequest) {
        log.info("saving book: {}", createBookRequest);

        // convert book request -> entity
        Book book = bookMapper.toEntity(createBookRequest);

        // save
        Book newBook = bookRepository.save(book);

        // convert entity -> book response
        return bookMapper.toDto(newBook);
    }

    // update
    public BookResponse update(BookRequest updateRequest, long id) {
        log.info("updating book with id: {} and request body: {}", id, updateRequest);

        // find
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("book not found"));

        // map
        bookMapper.map(book, updateRequest);

        // save
        Book updatedBook = bookRepository.save(book);

        // convert
        return bookMapper.toDto(updatedBook);
    }

    // partial update
    public BookResponse partialUpdate(Map<String, Object> updates, long id) {
        log.info("patching book with id: {} and request body: {}", id, updates);

        try {
            // find
            Book book = bookRepository.findById(id)
                    .orElseThrow(() -> new NotFoundException("book not found"));

            // update

            // Jackson deserializes and copies value to the already initialized DTO
            jacksonObjectMapper.readerForUpdating(book)
                    .readValue(jacksonObjectMapper.writeValueAsBytes(updates));

            // save
            Book updatedBook = bookRepository.save(book);

            // convert
            return bookMapper.toDto(updatedBook);
        } catch (Exception e) {
            log.error("could not patch book wiht id: {} and updates: {}", id, updates);
        }
        return null;
    }

    // delete
    public void deleteById(long id) {
        log.info("deleting book with id: {}", id);
        bookRepository.deleteById(id);
    }

    // find by author
    public List<BookResponse> findByAuthor(String author) {
        log.info("finding books by author: {}", author);

        // find all
        return bookRepository.findAll().stream()
                // filter
                .filter(book -> book.getAuthor().equals(author))
                // convert
                .map(book -> bookMapper.toDto(book))
                .collect(Collectors.toList());
    }
}
