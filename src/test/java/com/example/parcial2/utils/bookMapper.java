package com.example.parcial2.utils;

import com.example.parcial2.domain.dto.request.BookDTORequest;
import com.example.parcial2.domain.dto.response.BookDTOResponse;
import com.example.parcial2.domain.entities.Book;

import java.util.Date;

public class bookMapper {
    public static Book toEntity(BookDTORequest bookDTORequest){
        return Book.builder()
                .title(bookDTORequest.title())
                .author(bookDTORequest.author())
                .isbn(bookDTORequest.isbn())
                .genre(bookDTORequest.genre())
                .totalCopies(bookDTORequest.totalCopies())
                .availableCopies(bookDTORequest.availableCopies())
                .available(bookDTORequest.available())
                .publishedDate(bookDTORequest.publishedDate())
                .description(bookDTORequest.description())
                .build();
    }

    public static BookDTOResponse toResponse(Book book){
        return new BookDTOResponse(
                book.getGenre(),
                book.getAvailable()
        );
    }
}


