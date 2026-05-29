package com.example.parcial2.domain.dto.request;

import lombok.Builder;

import java.util.Date;

@Builder
public record BookDTORequest(
        String title,
        String author,
        String isbn,
        //Enum genre, comentado por error
        Integer totalCopies,
        Integer availableCopies,
        Boolean available,
        Date publishedDate,
        String description
) {
}
