package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
	
    List<Order> findByPurchasedBy(String purchasedBy);
    List<Order> findByPurchasedItem(String purchasedItem);

    List<Order> findByDatem(String datem);
}



