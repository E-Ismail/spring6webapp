package guru.springframework.repositories;

/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-webapp
 * @create 15/07/2025 - 22:28
 */

import guru.springframework.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
