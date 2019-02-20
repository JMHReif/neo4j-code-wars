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
public class Product {
    @Id @GeneratedValue
    private Long neoId;
    @NonNull
    private Long productId;
    @NonNull
    private String productName;

    private String quantityPerUnit;
    private Double unitPrice;
    private Integer unitsInStock, unitsOnOrder, reorderLevel, discontinued;

    //@Relationship(type="INCLUDES", direction = "INCOMING")
    //public List<Order> orderedProducts;
}
