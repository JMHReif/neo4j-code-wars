package com.jmhreif.neo4jcodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@NodeEntity
public class Contact {
    @Id @GeneratedValue
    private Long neoId;
    @NonNull
    private String contactName;
    private String contactTitle;

    @Relationship(type="HAS_CONTACT", direction = "INCOMING")
    public Customer customerContact;
}
