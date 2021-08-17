package com.jmhreif.neo4jcodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
<<<<<<< Updated upstream
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

=======
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;
>>>>>>> Stashed changes
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
<<<<<<< Updated upstream
@NodeEntity
public class Product {
    @Id @GeneratedValue
=======
@Node
class Product {
    @Id
    @GeneratedValue
>>>>>>> Stashed changes
    private Long neoId;
    @NonNull
    private Long productId;

    private String productName, quantityPerUnit;
    private Integer unitsInStock, unitsOnOrder, reorderLevel, discontinued;
    private double unitPrice;

<<<<<<< Updated upstream
    @Relationship(type = "INCLUDES", direction = Relationship.INCOMING)
    @JsonIgnoreProperties("product")
    private List<OrderedProduct> productOrders;
=======
    @Relationship(type = "INCLUDES", direction = Relationship.Direction.INCOMING)
    @JsonIgnoreProperties("product")
    private List<OrderedProduct> productOrders = new ArrayList<>();
>>>>>>> Stashed changes
}
