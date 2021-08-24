package com.jmhreif.neo4jcodewars;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {
    private final OrderRepo orderRepo;

    @GetMapping("/findbyid")
    Order findByOrderId(Long orderId) { return orderRepo.findByOrderId(orderId); }

    @GetMapping("/findbyproduct")
    Iterable<Order> findByProductName(String productName) { return orderRepo.findByProductName(productName); }
}
