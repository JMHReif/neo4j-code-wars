package com.jmhreif.neo4jcodewars;

<<<<<<< Updated upstream
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
=======
>>>>>>> Stashed changes
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

<<<<<<< Updated upstream
import java.util.ArrayList;
=======
>>>>>>> Stashed changes
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Node
<<<<<<< Updated upstream
class Product {
    @Id
    @GeneratedValue
=======
public class Product {
    @Id
    @GeneratedValue
    @NonNull
>>>>>>> Stashed changes
    private Long neoId;

    @NonNull
    private Long productId;
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    private String productName, quantityPerUnit;
    private Integer unitsInStock, unitsOnOrder, reorderLevel, discontinued;
    private double unitPrice;

<<<<<<< Updated upstream
    @Relationship(type = "INCLUDES", direction = Relationship.Direction.INCOMING)
    @JsonIgnoreProperties("product")
    private List<OrderedProduct> productOrders = new ArrayList<>();
=======
    @Relationship(value = "INCLUDES", direction = Relationship.Direction.INCOMING)
    private List<OrderedProduct> productOrders;
>>>>>>> Stashed changes
}
