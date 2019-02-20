package com.jmhreif.neo4jcodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@NodeEntity
public class Employee {
    @Id @GeneratedValue
    private Long neoId;
    @NonNull
    private Long employeeId;
    @NonNull
    private String lastName, firstName;

    private String birthDateStr, hireDateStr, title, titleOfCourtesy, address, city, region, postalCode, photo, homePhone, notes, photoPath;
    private Integer extension;

    @Relationship(type="LOCATED_IN")
    public Country country;

    //@JsonIgnoreProperties("orderEmployee")
    //@Relationship(type="MANAGED_BY", direction = "INCOMING")
    //public List<Order> managedOrders;
}
