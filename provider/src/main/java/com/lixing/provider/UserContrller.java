package com.lixing.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContrller {
    @Autowired
    private UserDao userDao;
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userDao.findOne(id);
    }
}
