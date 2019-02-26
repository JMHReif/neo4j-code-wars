package com.jmhreif.neo4jcodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

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

    private String orderDate, requiredDate, shippedDate;
    private String shipName, shipAddress, shipCity, shipRegion, shipPostalCode;
    private Integer shipVia;
    private double freight;

    @Relationship(type = "SHIPPED_TO")
    public Country shipCountry;

    @JsonIgnoreProperties("order")
    @Relationship(type = "INCLUDES")
    private List<OrderedProduct> orderedProducts;
}
