package com.example.booklist;

import com.example.booklist.model.Author;
import com.example.booklist.model.Book;
import com.example.booklist.repository.AuthorRepository;
import com.example.booklist.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class BookStoreApplication implements CommandLineRunner {

	private final BookRepository bookRepository;
	private final AuthorRepository authorRepository;


    public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Author tolkien = new Author(null, "J.R.R. Tolkien", "English writer, philologist, and academic", new ArrayList<>());
//		Author orwell = new Author(null, "George Orwell", "English novelist and essayist", new ArrayList<>());
//		Author martin = new Author(null, "Robert C. Martin", "Software engineer and author", new ArrayList<>());
//		Author hunt = new Author(null, "Andrew Hunt", "Co-author of 'The Pragmatic Programmer'", new ArrayList<>());
//		Author bloch = new Author(null, "Joshua Bloch", "Java specialist and author", new ArrayList<>());
//		Author fowler = new Author(null, "Martin Fowler", "Software engineer and author", new ArrayList<>());
//		Author rowling = new Author(null, "J.K. Rowling", "British author of Harry Potter series", new ArrayList<>());
//		Author king = new Author(null, "Stephen King", "Horror fiction author", new ArrayList<>());
//		Author lee = new Author(null, "Harper Lee", "Wrote 'To Kill a Mockingbird'", new ArrayList<>());
//		Author melville = new Author(null, "Herman Melville", "Wrote 'Moby Dick'", new ArrayList<>());
//
//		List<Author> authors = List.of(tolkien, orwell, martin, hunt, bloch, fowler, rowling, king, lee, melville);
//		authorRepository.saveAll(authors);
//
//
//		List<Book> books = new ArrayList<>();
//
//		books.add(new Book(null, "The Hobbit", "Fantasy", 1937, true, 12.99, List.of(tolkien)));
//		books.add(new Book(null, "1984", "Dystopian", 1949, true, 9.99, List.of(orwell)));
//		books.add(new Book(null, "Clean Code", "Programming", 2008, true, 34.99, List.of(martin)));
//		books.add(new Book(null, "The Pragmatic Programmer", "Programming", 1999, true, 39.95, List.of(hunt, martin)));
//		books.add(new Book(null, "Effective Java", "Programming", 2018, true, 45.00, List.of(bloch)));
//		books.add(new Book(null, "Refactoring", "Programming", 1999, true, 38.00, List.of(fowler, martin)));
//		books.add(new Book(null, "Harry Potter and the Philosopher's Stone", "Fantasy", 1997, true, 20.00, List.of(rowling)));
//		books.add(new Book(null, "The Shining", "Horror", 1977, true, 14.50, List.of(king)));
//		books.add(new Book(null, "To Kill a Mockingbird", "Classic", 1960, true, 10.50, List.of(lee)));
//		books.add(new Book(null, "The Art of Software Craftsmanship", "Programming", 2020, true, 29.00, List.of(martin, bloch, hunt)));
//
//		bookRepository.saveAll(books);
//
//		tolkien.setBooks(List.of(books.get(0)));
//		orwell.setBooks(List.of(books.get(1)));
//		martin.setBooks(List.of(books.get(2), books.get(3), books.get(5), books.get(9)));
//		hunt.setBooks(List.of(books.get(3), books.get(9)));
//		bloch.setBooks(List.of(books.get(4), books.get(9)));
//		fowler.setBooks(List.of(books.get(5)));
//		rowling.setBooks(List.of(books.get(6)));
//		king.setBooks(List.of(books.get(7)));
//		lee.setBooks(List.of(books.get(8)));
//		melville.setBooks(new ArrayList<>());
//
//		authorRepository.saveAll(List.of(tolkien, orwell, martin, hunt, bloch, fowler, rowling, king, lee, melville));

	}
}
