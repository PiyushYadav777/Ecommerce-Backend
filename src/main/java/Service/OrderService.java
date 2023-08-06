package Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Order;
import Repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public Order saveOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> saveOrders(List<Order> orders) {
        return repository.saveAll(orders);
    }

    public List<Order> getOrders() {
        return repository.findAll();
    }

    public Order getOrderById(int id) {
        return repository.findById(id).orElse(null);
    }
    
    public List<Order> getOrderByPurchasedItem(String purchasedItem) {
        return repository.findByPurchasedItem(purchasedItem);
    }

    public List<Order> getOrderByPurchasedBy(String purchasedBy) {
        return repository.findByPurchasedBy(purchasedBy);
    }
      public List<Order> getOrderByDatem(String datem) {
        return repository.findByDatem(datem);
    }


    public String deleteOrder(int id) {
        repository.deleteById(id);
        return "Order removed !! " + id;
    }

    public Order updateOrder(Order order) {
        Order existingOrder = repository.findById(order.getId()).orElse(null);
        existingOrder.setDate(order.getDate());
        existingOrder.setPurchasedBy(order.getPurchasedBy());
        existingOrder.setPurchasedItem(order.getPurchasedItem());

        return repository.save(existingOrder); 
    }


}


