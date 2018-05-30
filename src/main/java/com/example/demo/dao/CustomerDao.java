package com.example.demo.dao;

import com.example.demo.entity.Customer;

import java.util.List;

/**
 * Created by khent on 5/30/2018.
 */
public interface CustomerDao {
    void saveUser(Customer customer);
    List<Customer> getUsers();
    boolean loginUser(Customer customer);
}
