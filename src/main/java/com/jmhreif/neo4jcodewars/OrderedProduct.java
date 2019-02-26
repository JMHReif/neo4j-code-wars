package com.jmhreif.neo4jcodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

@Data
@EqualsAndHashCode(exclude={"order","product"})
@NoArgsConstructor
@RelationshipEntity(type = "INCLUDES")
public class OrderedProduct {
    @Id @GeneratedValue
    private Long neoId;

    private Integer quantity;
    private double unitPrice, discount;

    @StartNode
    @JsonIgnoreProperties("orderedProducts")
    private Order order;

    @EndNode
    @JsonIgnoreProperties("productOrders")
    private Product product;
}
