package shop.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    private Integer quantity;
    @Embedded
    private BookInfo book;

    public OrderItem() {
    }

    public OrderItem(BookInfo book, Integer quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BookInfo getBook() {
        return book;
    }

    public void setBook(BookInfo book) {
        this.book = book;
    }
}
