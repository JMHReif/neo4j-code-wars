package com.jmhreif.neo4jcodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class Customer {
    @Id @GeneratedValue
    private Long neoId;
    @NonNull
    private String customerId, companyName;
    private String address, city, region, postalCode, phone, fax;

    @Relationship(type="LOCATED_IN")
    public Country country;

    @Relationship(type="HAS_CONTACT")
    public Contact contact;

    //@JsonIgnoreProperties("orderCustomer")
    //@Relationship(type="CREATED_BY", direction = "INCOMING")
    //public List<Order> customerOrders;
}