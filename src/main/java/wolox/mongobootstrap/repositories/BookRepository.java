package wolox.mongobootstrap.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import wolox.mongobootstrap.models.Book;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    Book findByTitle(String title);

    Book save(Book book);

    List<Book> findAll();
}
