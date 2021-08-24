package com.jmhreif.neo4jcodewars;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
<<<<<<< Updated upstream
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
=======
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {
    private final OrderRepo orderRepo;

    @GetMapping("/findbyid")
    Order findByOrderId(Long orderId) { return orderRepo.findByOrderId(orderId); }

    @GetMapping("/findbyproduct")
    Iterable<Order> findByProductName(String productName) { return orderRepo.findByProductName(productName); }
>>>>>>> Stashed changes
}
