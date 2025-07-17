package guru.springframework.repositories;

/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-webapp
 * @create 15/07/2025 - 23:22
 */


import guru.springframework.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long>  {
}
