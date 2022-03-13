package shop.customer.controller;

import org.springframework.web.bind.annotation.*;
import shop.customer.model.Customer;
import shop.customer.repository.CustomerRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
 private CustomerRepository customerRepository;

 public UserController(CustomerRepository customerRepository){
     this.customerRepository = customerRepository;
 }
 @GetMapping("/hello")
 public String getHello() {return "You are lucky!";}

@GetMapping("/users")
    public List<Customer> getUsers(){
    return (List<Customer>) customerRepository.findAll();
}

@PostMapping("/users")
    public void addUser(@RequestBody Customer customer) {
     customerRepository.save(customer);
}

@PutMapping("/users/update/{id}")
    public Customer updateCustomer(@RequestBody Customer newCustomer, @PathVariable Long id){
        return customerRepository.findById(id)
             .map(customer -> {
                 customer.setEmail(newCustomer.getEmail());
                 customer.setFirstname(newCustomer.getFirstname());
                 return customerRepository.save(customer);
             })
             .orElseGet(() -> {
                 newCustomer.setId(id);
                 return customerRepository.save(newCustomer);
             });

}

}


