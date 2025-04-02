package com.talhaati.accounts.entity;

import jakarta.persistence.*;
import lombok.*;


// @Column explicitly specifies the data type of a column in database so we can use different variable name in our backend code
@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends  BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // database will automatically increment the id and generate the id for use eihter it is mysql, or postgresql according to the handling of database specific
    @Column(name="customer_id")
    private Long customerId;
    // to map a java class to database table

    private String name;

    private String email;

    @Column(name="mobile_number")
    private String mobileNumber;

}
