package com.jmhreif.neo4jcodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Node
public class Order {
    @Id
    @NonNull
    private Long orderId;

    private String orderDate;

    @Relationship("INCLUDES")
    private List<OrderedProduct> orderedProducts;
}
