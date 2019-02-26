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
public class Product {
    @Id @GeneratedValue
    private Long neoId;
    @NonNull
    private Long productId;

    private String productName, quantityPerUnit;
    private Integer unitsInStock, unitsOnOrder, reorderLevel, discontinued;
    private double unitPrice;

    @Relationship(type = "INCLUDES", direction = Relationship.INCOMING)
    @JsonIgnoreProperties("product")
    private List<OrderedProduct> productOrders;
}
