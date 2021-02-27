package com.example.onlineshop.service.Impl;

import com.example.onlineshop.model.Order;
import com.example.onlineshop.repository.OrderRepository;
import com.example.onlineshop.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order getById(Long id) {
        log.info("IN OrderServiceImpl getById {}", id);
        return orderRepository.findById(id).orElseGet(null);
    }

    @Override
    public void save(Order order) {
        log.info("IN OrderServiceImpl save{}", order);
        orderRepository.save(order);
    }

    @Override
    public void delete(Long id) {
        log.info("IN OrderServiceImpl delete {}", id);
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> getAll() {
        log.info("IN OrderServiceImpl getAll {}");
        return orderRepository.findAll();
    }
}
