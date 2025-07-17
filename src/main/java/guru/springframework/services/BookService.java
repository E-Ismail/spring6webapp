package guru.springframework.services;

/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-webapp
 * @create 17/07/2025 - 22:31
 */

import guru.springframework.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
