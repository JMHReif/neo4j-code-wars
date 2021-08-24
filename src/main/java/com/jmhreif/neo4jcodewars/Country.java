package com.jmhreif.neo4jcodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Node
<<<<<<< Updated upstream
class Country {
    @Id
    @GeneratedValue
=======
public class Country {
    @Id
    @GeneratedValue
    @NonNull
>>>>>>> Stashed changes
    private Long neoId;

    @NonNull
    private String name;
}
