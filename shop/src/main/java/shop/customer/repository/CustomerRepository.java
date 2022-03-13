package shop.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.customer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findCustomerByEmail(String email);
}
