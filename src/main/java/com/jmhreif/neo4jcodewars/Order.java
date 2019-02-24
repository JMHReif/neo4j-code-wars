package com.jmhreif.neo4jcodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@NodeEntity
public class Order {
    @Id @GeneratedValue
    private Long neoId;
    @NonNull
    private Long orderId;

    private Integer shipVia;
    private Double freight;
    private String orderDate, requiredDate, shippedDate, shipName, shipAddress, shipCity, shipRegion, shipPostalCode;

    @Relationship(type="SHIPPED_TO")
    public Country shipCountry;

    @Relationship(type="INCLUDES")
    public List<Product> orderProducts;
}
