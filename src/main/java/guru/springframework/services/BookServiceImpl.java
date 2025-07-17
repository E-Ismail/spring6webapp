package guru.springframework.services;

/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-webapp
 * @create 17/07/2025 - 22:32
 */

import guru.springframework.domain.Book;
import guru.springframework.repositories.BookRepository;
import org.springframework.stereotype.Service;


//Stereotype
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
