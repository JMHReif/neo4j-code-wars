package com.jmhreif.neo4jcodewars;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OrderRepo extends Neo4jRepository<Order, Long> {

    Order findByOrderId(Long orderId);

    @Query("MATCH (p:Product)-[rel:INCLUDES]-(o:Order)-[r]-(c:Country) WHERE tolower(p.productName) CONTAINS {productName} RETURN *")
    Iterable<Order> findOrdersByProduct(String productName);
}
