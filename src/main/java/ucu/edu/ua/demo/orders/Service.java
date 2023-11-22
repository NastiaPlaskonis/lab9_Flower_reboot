package ucu.edu.ua.demo.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {
    @Autowired
    private RepositoryOrder repository;

    public List<Order> getAll() {
        return repository.getAll();
    }

    public String info(int userId) {
        Order order = repository.getId(userId);
        return order.processingOrder();
    }

    public int addOrder(Order userOrder) {
        return repository.save(userOrder);
    }
}