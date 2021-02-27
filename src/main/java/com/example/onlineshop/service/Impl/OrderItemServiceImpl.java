//package com.example.onlineshop.service.Impl;
//
//import com.example.onlineshop.model.CollaboratorId;
//import com.example.onlineshop.model.OrderItem;
//import com.example.onlineshop.repository.OrderItemRepository;
//import com.example.onlineshop.service.OrderItemService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@Slf4j
//public class OrderItemServiceImpl implements OrderItemService {
//    private OrderItemRepository orderItemRepository;
//
//    @Autowired
//    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
//        this.orderItemRepository = orderItemRepository;
//    }
//
//    @Override
//    public OrderItem getByCollaboratorId(CollaboratorId id) {
//        log.info("IN OrderItemServiceImpl getByCollaboratorId {}", id);
//        return orderItemRepository.findById(id).orElseGet(null);
//    }
//
//
//    @Override
//    public void save(OrderItem orderItem) {
//        log.info("IN OrderItemServiceImpl save {}", orderItem);
//        orderItemRepository.save(orderItem);
//    }
//
//    @Override
//    public void delete(CollaboratorId id) {
//        log.info("IN OrderItemServiceImpl delete{}", id);
//        orderItemRepository.deleteById(id);
//    }
//
//    @Override
//    public List<OrderItem> getAll() {
//        log.info("IN OrderItemServiceImpl getAll {}");
//        return orderItemRepository.findAll();
//    }
//}
