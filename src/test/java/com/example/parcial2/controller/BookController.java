package com.example.parcial2.controller;

import com.example.parcial2.domain.dto.GeneralResponse;
import com.example.parcial2.domain.dto.request.BookDTORequest;
import com.example.parcial2.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookController {
    private BookService bookService;

    @PostMapping
    public ResponseEntity<GeneralResponse> createBook(@RequestBody BookDTORequest book) {
        bookService.createBook(book);
        return ResponseEntity.ok(GeneralResponse.builder()
                .data(book)
                .message("Libro ha sido creado")
                .build());

}
    @GetMapping
    public ResponseEntity<GeneralResponse> findAll(){
        return ResponseEntity.ok(GeneralResponse.builder()
                .data(bookService.findAllBook())
                .message("Libros encontrados")
                .build());
    }
}