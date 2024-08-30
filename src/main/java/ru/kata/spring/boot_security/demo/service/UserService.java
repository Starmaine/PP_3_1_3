package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user, Set<Long> roleIds);

    User findById(Long id);

    void saveAll(List<User> users);

    void update(User updatedUser, Set<Long> roleIds);

    void delete(Long id);

    User findByUsername(String username);
}
