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
public class Product {
    @Id
    @GeneratedValue
    @NonNull
    private Long neoId;

    @NonNull
    private Long productId;

    private String productName, quantityPerUnit;
    private Integer unitsInStock, unitsOnOrder, reorderLevel, discontinued;
    private double unitPrice;

    @Relationship(value = "INCLUDES", direction = Relationship.Direction.INCOMING)
    private List<OrderedProduct> productOrders;
}
