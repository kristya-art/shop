package shop.order.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import shop.order.model.Order;
import shop.order.model.OrderItem;
import shop.order.service.OrderNotFoundException;
import shop.order.service.OrderService;
import shop.user.model.Customer;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createOrder(@RequestBody Customer customer, List<OrderItem> items){
        orderService.createOrder(customer,items);
    }

   @GetMapping("{id}")
  public Order findOrder(@PathVariable long id) throws OrderNotFoundException {
        Order order = orderService.findOrder(id);
        return order;
  }
  @GetMapping
    public List<Order> findAllOrders(){
        return orderService.findAllOrders();
  }
}
