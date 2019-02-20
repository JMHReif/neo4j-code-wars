package com.jmhreif.neo4jcodewars;

import org.springframework.data.neo4j.annotation.Depth;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface OrderRepo extends Neo4jRepository<Order, Long> {

    Order findByOrderId(Long orderId);

    Iterable<Order> findByOrOrderIdLike(Long orderId);

    //@Query("MATCH path=(:Order)-[*2]->() RETURN path LIMIT 100")
    @Query("MATCH (o:Order)-[rel]->(n) RETURN o, rel, n LIMIT 100")
    Collection<Order> graph();
}
