//package com.example.onlineshop.rest;
//
//import com.example.onlineshop.model.CollaboratorId;
//import com.example.onlineshop.model.Order;
//import com.example.onlineshop.model.OrderItem;
//import com.example.onlineshop.service.OrderItemService;
//import com.example.onlineshop.service.OrderService;
//import com.example.onlineshop.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
////@RequestMapping("/{orderId}/order-item")
//@RequestMapping("/order-item")
//public class OrderItemRestController {
//    private OrderItemService orderItemService;
//
//    @Autowired
//    public OrderItemRestController(OrderItemService orderItemService) {
//        this.orderItemService = orderItemService;
//    }
//
//    //// GET OrderItems BY orderID
//    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<OrderItem>> getOrderItem(@PathVariable("orderId") Long orderId) {
//        if (orderId == null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        List<OrderItem> orderItemList = orderItemService.getAll()
//                .stream()
//                .filter(ordIt -> ordIt.getOrder().getId().equals(orderId))
//                .collect(Collectors.toList());
//
//        if (orderItemList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<>(orderItemList, HttpStatus.OK);
//    }
//
//    // GET OrderItems BY productID
//    @RequestMapping(value = "/product/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<OrderItem>> getProductItem(@PathVariable("orderId") Long productId) {
//        if (productId == null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        List<OrderItem> orderItemList = orderItemService.getAll()
//                .stream()
//                .filter(ordIt -> ordIt.getProduct().getId().equals(productId))
//                .collect(Collectors.toList());
//
//        if (orderItemList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<>(orderItemList, HttpStatus.OK);
//    }
//
//
//    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<OrderItem> saveOrderItem(OrderItem orderItem) {
//        if (orderItem == null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        orderItemService.save(orderItem);
//
//        return new ResponseEntity<>(orderItem, HttpStatus.CREATED);
//    }
//
//    @RequestMapping(value = "/order/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<OrderItem> deleteOrderItem(@PathVariable("id") Long orderId) {
//        if (orderId == null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        OrderItem orderItem = orderItemService.getByOrderId(orderId);
//
//        if (orderItem == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<>(orderItem, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<OrderItem>> getAllOrderItems() {
//        List<OrderItem> itemList = orderItemService.getAll();
//
//        if (itemList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<>(itemList, HttpStatus.OK);
//    }
//}
