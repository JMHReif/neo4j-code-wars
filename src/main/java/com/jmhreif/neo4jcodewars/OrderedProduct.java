package com.jmhreif.neo4jcodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@Data
@EqualsAndHashCode(exclude={"order","product"})
@NoArgsConstructor
@RelationshipProperties
class OrderedProduct {
    @Id
    @GeneratedValue
    private Long neoId;

    private Integer quantity;
    private double unitPrice, discount;

    @TargetNode
    @JsonIgnoreProperties("productOrders")
    private Product product;
}
