package shop.user.repository;

import org.springframework.data.repository.CrudRepository;
import shop.user.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
