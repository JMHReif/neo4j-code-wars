package com.jmhreif.neo4jcodewars;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
class OrderController {
    private final OrderRepo orderRepo;

    @GetMapping
    public Iterable<Order> findAllOrders() { return orderRepo.findAll(); }

    @GetMapping("/findorderbyid")
    public Order findOrderByOrderId(Long orderId) { return orderRepo.findOrderByOrderId(orderId); }

    @GetMapping("/findordersbyproduct")
    public Iterable<Order> findOrdersByOrderedProductsContaining(String productName) { return orderRepo.findOrdersByOrderedProductsContaining(productName); }
}
