package com.example.parcial2.service;

import com.example.parcial2.domain.dto.request.BookDTORequest;
import com.example.parcial2.repository.BookRepository;
import com.example.parcial2.utils.bookMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private BookRepository bookRepository;

    public void createBook(BookDTORequest book){
        bookRepository.save(bookMapper.toEntity(book));
    }
}
