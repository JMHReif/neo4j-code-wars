package com.jmhreif.neo4jcodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
<<<<<<< Updated upstream
import org.neo4j.ogm.annotation.*;
=======
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;
>>>>>>> Stashed changes

@Data
@EqualsAndHashCode(exclude={"order","product"})
@NoArgsConstructor
<<<<<<< Updated upstream
@RelationshipEntity(type = "INCLUDES")
public class OrderedProduct {
    @Id @GeneratedValue
=======
@RelationshipProperties
class OrderedProduct {
    @Id
    @GeneratedValue
>>>>>>> Stashed changes
    private Long neoId;

    private Integer quantity;
    private double unitPrice, discount;

<<<<<<< Updated upstream
    @StartNode
    @JsonIgnoreProperties("orderedProducts")
    private Order order;

    @EndNode
=======
    @TargetNode
>>>>>>> Stashed changes
    @JsonIgnoreProperties("productOrders")
    private Product product;
}
