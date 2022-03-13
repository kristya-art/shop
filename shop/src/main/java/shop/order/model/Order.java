package shop.order.model;
import shop.customer.model.CreditCard;
import shop.customer.model.Customer;
import shop.customer.model.Address;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="book_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="order_id")
    private List<OrderItem> items;

    @Column(name="status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(name="amount")
    private BigDecimal amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="customer_id")
    private Customer customer;

    @Embedded
    private Address address;

    @Embedded
   private CreditCard creditCard;

    public Order() {
    }

    public Order(List<OrderItem> items, OrderStatus status, BigDecimal amount, Date date,
                 Customer customer) {
        this.items = items;
        this.status = status;
        this.amount = amount;
        this.date = date;
        this.customer = customer;
        this.address = customer.getAddress();
        this.creditCard = customer.getCreditCard();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public OrderStatus getOrderStatus() {
        return status;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.status = orderStatus;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
