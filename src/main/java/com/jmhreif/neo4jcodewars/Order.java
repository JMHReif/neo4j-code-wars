package com.jmhreif.neo4jcodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Node
public class Order {
    @Id
    @GeneratedValue
    @NonNull
    private Long neoId;

    @NonNull
    private Long orderId;

    private String orderDate, requiredDate, shippedDate;
    private String shipName, shipAddress, shipCity, shipRegion, shipPostalCode;
    private Integer shipVia;
    private double freight;

    @Relationship("INCLUDES")
    private List<OrderedProduct> orderedProducts;

    @Relationship("SHIPPED_TO")
    private Country country;
}
