package com.example.onlineshop.service;

import com.example.onlineshop.model.Order;

import java.util.List;

public interface OrderService {
    Order getById(Long id);

    void save(Order order);

    void delete(Long id);

    List<Order> getAll();
}
