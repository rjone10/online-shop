package com.example.onlineshop.repository;

import com.example.onlineshop.model.CollaboratorId;
import com.example.onlineshop.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, CollaboratorId> {

}
