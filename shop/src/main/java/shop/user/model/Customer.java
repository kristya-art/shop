package shop.user.model;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="first_name")
    private String firstname;
    @Column(name = "lastName")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name = "password")
    private String password;
//    @Valid
    @Embedded
    private CreditCard creditCard;
    @Embedded
    private Address address;

    public Customer(){}

    public Customer( String firstname, String lastName, String email, String password, CreditCard creditCard, Address address) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.creditCard = creditCard;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
