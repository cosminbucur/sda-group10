package com.sda.spring.boot.rest.dto;

import com.sda.spring.boot.rest.model.Book;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookMapper {

    // toEntity: frontend to db
    public Book toEntity(BookRequest dto) {
        Book entity = new Book();
        entity.setTitle(dto.getTitle());
        entity.setAuthor(dto.getAuthor());
        entity.setPublished(dto.getPublished());
        return entity;
    }

    // toDto: db to frontend
    public BookResponse toDto(Book book) {
        BookResponse dto = new BookResponse();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setPublished(book.getPublished());
        return dto;
    }

    public List<BookResponse> toDtos(List<Book> books) {
        // for each book in books - convert to book response
        return books.stream()
                .map(book -> toDto(book))
                .collect(Collectors.toList());
    }

    public void map(Book bookToUpdate, BookRequest updateRequest) {
        // on book to update set fields from update request
        if (!StringUtils.isEmpty(updateRequest.getTitle())) {
            bookToUpdate.setTitle(updateRequest.getTitle());
        }

        if (!StringUtils.isEmpty(updateRequest.getAuthor())) {
            bookToUpdate.setTitle(updateRequest.getAuthor());
        }

        // not null and not in the future
        if (updateRequest.getPublished() != null
                && updateRequest.getPublished().isBefore(LocalDate.now())) {
            bookToUpdate.setPublished(updateRequest.getPublished());
        }
    }
}
