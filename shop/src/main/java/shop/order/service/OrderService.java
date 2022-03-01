package shop.order.service;

import org.springframework.stereotype.Service;

import shop.order.model.Order;
import shop.order.model.OrderItem;
import shop.order.model.OrderStatus;
import shop.order.repository.OrderRepository;
import shop.user.model.Customer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    OrderRepository orderRepository;

    public OrderService(OrderRepository repository){
        orderRepository=repository;
    }

    public Order createOrder(Customer customer, List<OrderItem> items){

        BigDecimal amount = new BigDecimal(0);
         for(OrderItem oi : items){
             amount = oi.getBook().getPrice().multiply(new BigDecimal(oi.getQuantity()).plus());
        }
                Order newOrder = new Order(items, OrderStatus.ACCEPTED, amount, new Date(),
                        customer
                );
         orderRepository.save(newOrder);
         return  newOrder;
    }

    public Order findOrder(long id) throws OrderNotFoundException{
       Order order = orderRepository.findById(id).orElseThrow(OrderNotFoundException::new);
       return order;
    }

    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }



}
