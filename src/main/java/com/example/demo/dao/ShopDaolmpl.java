package com.example.demo.dao;

import com.example.demo.entity.Shop;
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
public class ShopDaolmpl implements ShopDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Shop> getItems() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery("from Shop");
        List <Shop> items = query.list();
        return items;
    }
}
