package com.jmhreif.neo4jcodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@RelationshipProperties
public class OrderedProduct {
    @Id
    @GeneratedValue
    @NonNull
    private Long neoId;

    private Integer quantity;
    private double unitPrice, discount;

    @TargetNode
    @JsonIgnoreProperties({"productOrders"})
    private Product product;
}
