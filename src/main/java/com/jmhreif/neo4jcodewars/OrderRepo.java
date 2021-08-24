package com.jmhreif.neo4jcodewars;

import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {
    Order findByOrderId(Long orderId);

    @Query("MATCH (o:Order)-[r:INCLUDES]->(p:Product) WHERE p.productName =~ ('(?i).*'+$productName+'.*') RETURN *;")
    Iterable<Order> findByProductName(String productName);
}
