package shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import shop.order.model.BookInfo;
import shop.order.model.Order;
import shop.order.model.OrderItem;
import shop.order.model.OrderStatus;
import shop.order.repository.OrderRepository;
import shop.order.service.OrderService;
import shop.user.model.Address;
import shop.user.model.CreditCard;
import shop.user.model.CreditCardType;
import shop.user.model.Customer;
import shop.user.repository.CustomerRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    OrderRepository orderRepository;

    OrderService orderService;

    CustomerRepository customerRepository;

    DataLoader(OrderService orderService, OrderRepository orderRepository, CustomerRepository customerRepository){
        this.orderRepository=orderRepository;
        this.orderService=orderService;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {


        BookInfo book = new BookInfo("SsrL","Physic for Beginners","Amadeo Dolce",new BigDecimal(13.8));
        BookInfo book2 = new BookInfo("JBS","Java for all","Dick Horseman",new BigDecimal(27.8));
        BookInfo book3 = new BookInfo("KL","Psychiatry","Kaka Shimi",new BigDecimal(48.0));
        BookInfo book4 = new BookInfo("PPs","Mozart","Leonardo Dios",new BigDecimal(13.7));

        OrderItem orderItem = new OrderItem(book,1);
        OrderItem orderItem2 = new OrderItem(book2,3);

        Customer customer1 = new Customer("Alic", "Boldwin","alic@gmx.com","alicb^^^^",new CreditCard(CreditCardType.VISA,"1234",06,2023),new Address());
//        Customer Customer3 = new Customer("Make", "make@gmx.com");
//        Customer Customer2 = new Customer("Karol", "karol@gmx.com");

//			ArrayList<Customer> list = new ArrayList<>();
//			list.add(Customer1);
//			list.add(Customer2);
//			list.add(Customer3);
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        orderItems.add(orderItem2);
        // Order newOrder = orderService.createOrder(Customer1,orderItems);

        Order order = new Order(orderItems,OrderStatus.ACCEPTED,new BigDecimal(89.0),new Date(),customer1);
        customerRepository.save(customer1);
        orderRepository.save(order);
    }
}
