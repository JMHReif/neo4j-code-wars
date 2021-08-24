package com.jmhreif.neo4jcodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
<<<<<<< Updated upstream
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;
=======
import org.springframework.data.neo4j.core.schema.*;

>>>>>>> Stashed changes
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Node
public class Order {
    @Id
    @GeneratedValue
<<<<<<< Updated upstream
=======
    @NonNull
>>>>>>> Stashed changes
    private Long neoId;

    @NonNull
    private Long orderId;

    private String orderDate, requiredDate, shippedDate;
    private String shipName, shipAddress, shipCity, shipRegion, shipPostalCode;
    private Integer shipVia;
    private double freight;

<<<<<<< Updated upstream
    @Relationship(type = "INCLUDES")
    @JsonIgnoreProperties("order")
    private List<OrderedProduct> orderedProducts = new ArrayList<>();

    @Relationship(type = "SHIPPED_TO")
=======
    @Relationship("INCLUDES")
    private List<OrderedProduct> orderedProducts;

    @Relationship("SHIPPED_TO")
>>>>>>> Stashed changes
    private Country country;
}
