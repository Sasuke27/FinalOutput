package com.example.demo.dao;

import com.example.demo.entity.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by khent on 5/30/2018.
 */

@Repository
@Transactional
public class CustomerDaolmpl implements CustomerDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveUser(Customer customer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(customer);
    }

    @Override
    public List<Customer> getUsers() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery("from Customer");
        List <Customer> customer = query.list();
        return customer;
    }

    @Override
    public boolean loginUser(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        Query q = session.createQuery("from Customer customer where customer.username =:name and customer.password =:pass");
        q.setString("name",customer.getUsername());
        q.setString("pass",customer.getPassword());
        if(q.list().isEmpty()){
            return false;
        }
        return true;
    }
}
