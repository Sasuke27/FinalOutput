package com.example.demo.service;

import com.example.demo.dao.ShopDao;
import com.example.demo.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ShopServicelmpl implements ShopService {
    @Autowired
    private ShopDao shopDao;

    @Override
    public List<Shop> getItems() {
        return shopDao.getItems();
    }
}