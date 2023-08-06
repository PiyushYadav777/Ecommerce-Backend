package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Entity.Consumer;
import Service.ConsumerService;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService service;

    @PostMapping("/addConsumer")
    public Consumer addConsumer(@RequestBody Consumer consumer) {
        return service.saveConsumer(consumer);
    }

    @PostMapping("/addConsumers")
    public List<Consumer> addConsumers(@RequestBody List<Consumer> consumers) {
        return service.saveConsumers(consumers);
    }

    @GetMapping("/consumers")
    public List<Consumer> findAllConsumers() {
        return service.getConsumers();
    }

    @GetMapping("/consumerById/{id}")
    public Consumer findConsumerById(@PathVariable int id) {
        return service.getConsumerById(id);
    }

    @GetMapping("/consumer/{name}")
    public Consumer findConsumerByName(@PathVariable String name) {
        return service.getConsumerByName(name);
    }

    @PutMapping("/consumer/update")
    public Consumer updateConsumer(@RequestBody Consumer consumer) {
        return service.updateConsumer(consumer);
    }

    @DeleteMapping("/consumer/delete/{id}")
    public String deleteConsumer(@PathVariable int id) {
        return service.deleteConsumer(id);
    }
}
