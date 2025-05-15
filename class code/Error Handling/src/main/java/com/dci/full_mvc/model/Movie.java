package com.dci.full_mvc.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


//@NotNull          // Field must not be null
//@NotEmpty         // Field must not be null or empty
//@NotBlank         // String must not be null or whitespace
//@Size(min=, max=) // Size boundaries for strings, collections
//@Min(value=)      // Minimum value for numbers
//@Max(value=)      // Maximum value for numbers
//@Email            // Must be a well-formed email address
//@Pattern(regexp=) // Must match the regular expression pattern


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@ToString
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int releaseYear;
    private int duration;
    private String language;
    private boolean wonOscars;

    @ManyToOne
    @JoinColumn(name="director_id")
    private Director director;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="movies_genres",
            joinColumns = @JoinColumn(name="movie_id"),
            inverseJoinColumns = @JoinColumn(name="genre_id")
    )
    private List<Genre> genres = new ArrayList<>();

}
