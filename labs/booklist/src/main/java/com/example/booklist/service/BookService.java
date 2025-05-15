package com.example.booklist.service;

import com.example.booklist.exception.ResourceNotFound;
import com.example.booklist.model.Author;
import com.example.booklist.model.Book;
import com.example.booklist.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorService authorService;

    public List<Book> findAllBooksByIds(List<Long> ids) {
        return bookRepository.findAllById(ids);
    }

    public void saveAllBooks(List<Book> books) {
        bookRepository.saveAll(books);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public void deleteAuthorFromBooks(Author author) {
        List<Book> books = author.getBooks();
        for (Book book : books) {
            List<Author> authors = book.getAuthors();
            authors.remove(author);
            book.setAuthors(authors);
        }
        bookRepository.saveAll(books);
    }

    public void updateBook(Book book, List<Long> authorIds) {
        List<Author> authors = bookRepository.findById(book.getId()).get().getAuthors();
        authors.forEach(author -> {
            author.getBooks().remove(book);
        });
        book.getAuthors().clear();
        List<Author> newAuthors = authorService.findAllAuthorsByBookId(authorIds);
        newAuthors.forEach(author -> {
            author.getBooks().add(book);
            book.getAuthors().add(author);
        });
        authorService.saveAllAuthors(newAuthors);
        bookRepository.save(book);
    }

    public void addNewBook(Book book, List<Long> authorIds) {
        bookRepository.save(book);
        List<Author> authors = authorService.findAllAuthorsByBookId(authorIds);
        authors.forEach(author -> {
            author.getBooks().add(book);
            book.getAuthors().add(author);
        });
        authorService.saveAllAuthors(authors);
        book.setAuthors(authors);

        bookRepository.save(book);
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Book not found"));
    }

//    public List<String> findAllGenres() {
//        return bookRepository.findAllGenres();
//    }

//    public List<Book> findBooksByGenres(List<String> genre) {
//        return bookRepository.findBooksByGenres(genre);
//    }
}
