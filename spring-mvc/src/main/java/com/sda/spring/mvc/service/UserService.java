package com.sda.spring.mvc.service;

import com.sda.spring.mvc.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> list();
}
