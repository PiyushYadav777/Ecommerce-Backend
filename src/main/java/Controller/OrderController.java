package Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import Entity.Order;
import Service.OrderService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/addOrder")
    public Order addOrder(@RequestBody Order order) {
    	LocalDate currentdate = LocalDate.now();
    	System.out.println(currentdate);
    	order.setDate(currentdate.toString());
        return service.saveOrder(order);
    }

    @PostMapping("/addOrders")
    public List<Order> addOrders(@RequestBody List<Order> orders) {
        return service.saveOrders(orders);
    }

    @GetMapping("/orders")
    public List<Order> findAllOrders() {
        return service.getOrders();
    }

    @GetMapping("/orderById/{id}")
    public Order findOrderById(@PathVariable int id) {
        return service.getOrderById(id);
    }
    
    @GetMapping("/orderByConsumer/{consumer}")
    public List<Order> findOrderByConsumer(@PathVariable String consumer) {
        return service.getOrderByPurchasedBy(consumer);
    }
    
    @GetMapping("/orderByProduct/{product}")
    public List<Order> findOrderByProduct(@PathVariable String product) {
        return service.getOrderByPurchasedItem(product);
    }
    
    @GetMapping("/orderBydatem/{datem}")
    public List<Order> findOrderByDatem(@PathVariable String datem) {
        return service.getOrderByDatem(datem);
    }



    @PutMapping("/order/update")
    public Order updateOrder(@RequestBody Order Order) {
        return service.updateOrder(Order);
    }

    @DeleteMapping("/order/delete/{id}")
    public String deleteOrder(@PathVariable int id) {
        return service.deleteOrder(id);
    }
}



