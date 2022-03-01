package shop.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.order.model.Order;
import shop.order.model.OrderInfo;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

//    List<OrderInfo> findTop10ByCustomerIdOrderByDateDesc(long customerId);
//
//    List<OrderInfo> findByCustomerIdAndDateBetween(long customerId, Date startDate, Date endDate);

}
