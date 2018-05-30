package com.example.demo.service;

import com.example.demo.entity.Customer;

import java.util.List;

/**
 * Created by khent on 5/30/2018.
 */
public interface CustomerService {
    List<Customer> getUsers();
    void saveUser(Customer user);
    boolean login (Customer user);
}

