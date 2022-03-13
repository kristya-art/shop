package shop.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import shop.order.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    boolean existsByIsbn(String isbn);
}
