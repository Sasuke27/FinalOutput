package com.example.demo.service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by khent on 5/30/2018.
 */
@Service
@Transactional
public class CustomerServicelmpl implements CustomerService{
    @Autowired
    private CustomerDao userDao;
    @Override
    public List<Customer> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void saveUser(Customer user) {
        userDao.saveUser(user);
    }

    @Override
    public boolean login(Customer user) {
        return userDao.loginUser(user);
    }
}