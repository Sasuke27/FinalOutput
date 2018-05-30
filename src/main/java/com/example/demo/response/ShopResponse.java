package com.example.demo.response;

import com.example.demo.entity.Shop;

import java.util.List;

/**
 * Created by khent on 5/30/2018.
 */
public class ShopResponse {
    private SystemResponse systemResponse;
    private List<Shop> items;

    public ShopResponse() {
    }

    public ShopResponse(SystemResponse systemResponse, List<Shop> items) {
        this.systemResponse = systemResponse;
        this.items = items;
    }

    public SystemResponse getSystemResponse() {
        return systemResponse;
    }

    public void setSystemResponse(SystemResponse systemResponse) {
        this.systemResponse = systemResponse;
    }

    public List<Shop> getItems() {
        return items;
    }

    public void setItems(List<Shop> items) {
        this.items = items;
    }
}
