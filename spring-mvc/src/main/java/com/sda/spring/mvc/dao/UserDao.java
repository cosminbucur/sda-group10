package com.sda.spring.mvc.dao;

import com.sda.spring.mvc.model.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    List<User> list();
}
