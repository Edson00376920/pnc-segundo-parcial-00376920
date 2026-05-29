package com.example.parcial2.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;
@Entity
@Data
@Table(name = "Book")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private UUID id;

        @Column(name = "title")
        private String title;

        @Column(name = "author")
        private String author;

        @Column(name = "isbn")
        private String isbn;

        @Column(name = "genre")
        private Enum genre;

        @Column(name = "totalCopies")
        private Integer totalCopies;

        @Column(name = "availableCopies")
        private Integer availableCopies;

        @Column(name = "available")
        private Boolean available;

        @Column(name = "publishedDate")
        private Date publishedDate;

        @Column(name = "description")
        private String description;
}
