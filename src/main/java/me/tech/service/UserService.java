package me.tech.service;

import me.tech.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);


}
