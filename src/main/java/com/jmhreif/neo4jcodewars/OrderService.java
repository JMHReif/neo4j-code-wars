package com.jmhreif.neo4jcodewars;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class OrderService {
    private final OrderRepo orderRepo;

    @Transactional(readOnly = true)
    public Order findByOrderId(Long orderId) { return orderRepo.findByOrderId(orderId); }

    @Transactional(readOnly = true)
    public Iterable<Order> findByOrderIdLike(Long orderId) { return orderRepo.findByOrOrderIdLike(orderId); }
}
