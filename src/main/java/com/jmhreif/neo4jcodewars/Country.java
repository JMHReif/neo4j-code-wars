package com.jmhreif.neo4jcodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@NodeEntity
public class Country {
    @Id @GeneratedValue
    private Long neoId;
    @NonNull
    private String name;

    //@Relationship(type = "LOCATED_IN", direction = "INCOMING")
    //public List<Customer> customerLocations;

    //@JsonIgnoreProperties("shipCountry")
    //@Relationship(type="SHIPPED_TO", direction = "INCOMING")
    //public List<Order> orderLocations;

    //@Relationship(type="LOCATED_IN", direction = "INCOMING")
    //public List<Employee> employeeLocations;
}
