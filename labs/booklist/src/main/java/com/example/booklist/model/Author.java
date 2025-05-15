package com.example.booklist.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString (exclude = {"books"})
@EqualsAndHashCode (of = {"id"})
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String bio;

    @ManyToMany(mappedBy = "authors", fetch = FetchType.EAGER)
    private List<Book> books = new ArrayList<>();



}
