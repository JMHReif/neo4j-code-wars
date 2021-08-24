package com.jmhreif.neo4jcodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
<<<<<<< Updated upstream
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
=======
import lombok.*;
>>>>>>> Stashed changes
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@Data
<<<<<<< Updated upstream
@EqualsAndHashCode(exclude={"order","product"})
@NoArgsConstructor
@RelationshipProperties
class OrderedProduct {
    @Id
    @GeneratedValue
=======
@NoArgsConstructor
@RequiredArgsConstructor
@RelationshipProperties
public class OrderedProduct {
    @Id
    @GeneratedValue
    @NonNull
>>>>>>> Stashed changes
    private Long neoId;

    private Integer quantity;
    private double unitPrice, discount;

    @TargetNode
<<<<<<< Updated upstream
    @JsonIgnoreProperties("productOrders")
=======
    @JsonIgnoreProperties({"productOrders"})
>>>>>>> Stashed changes
    private Product product;
}
