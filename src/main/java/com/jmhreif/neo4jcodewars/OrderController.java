package com.jmhreif.neo4jcodewars;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/")
    public Iterable<Order> findAllOrders() { return orderService.findAllOrders(); }

    @GetMapping("/findbyorderid")
    public Order findByOrderId(@RequestParam Long orderId) {
        return orderService.findByOrderId(orderId);
    }

    @GetMapping("/findordersbyproduct")
    public Iterable<Order> findOrdersByProduct(@RequestParam String productName) { return orderService.findOrderByProduct(productName); }
}
