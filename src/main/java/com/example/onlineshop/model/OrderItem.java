package com.example.onlineshop.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_items")
public class OrderItem {
    @EmbeddedId
    private CollaboratorId collaboratorId;

    ///
    @MapsId("orderId")
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @MapsId("productId")
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    ///

    @Column(name = "quantity")
    private Long quantity;

}
