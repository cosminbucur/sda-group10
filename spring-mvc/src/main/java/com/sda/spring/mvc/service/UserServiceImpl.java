package com.sda.spring.mvc.service;

import com.sda.spring.mvc.dao.UserDao;
import com.sda.spring.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        // validation
        // mapping
        userDao.save(user);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }
}
