package com.example.onlineshop.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class CollaboratorId implements Serializable {

    private Long orderId;
    private Long productId;

}
