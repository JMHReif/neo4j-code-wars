package com.jmhreif.neo4jcodewars;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CustomerRepo extends Neo4jRepository<Customer, Long> {
}
