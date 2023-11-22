package ucu.edu.ua.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor

public class Service {
    @Autowired
    private RepositoryUser repository;

    public List<User> getAll() {
        return repository.findAll();
    }

    public void addUser(User user) {
        repository.save(user);
    }
}