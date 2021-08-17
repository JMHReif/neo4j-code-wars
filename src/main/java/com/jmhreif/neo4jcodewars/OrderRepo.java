package com.jmhreif.neo4jcodewars;

import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

interface OrderRepo extends CrudRepository<Order, Long> {
    Order findOrderByOrderId(Long orderId);

    @Query("MATCH (p:Product)<-[rel:INCLUDES]-(o:Order) WHERE p.productName =~ ('(?i).*'+$productName+'.*') RETURN *;")
    Iterable<Order> findOrdersByOrderedProductsContaining(String productName);
}
