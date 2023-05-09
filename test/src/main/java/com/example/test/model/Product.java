package com.example.test.model;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
@Table(name = "User")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invoice_id")
    private Long invoice_id;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "product_id")
    private String product_id;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "unit")
    private Number unit;

}
