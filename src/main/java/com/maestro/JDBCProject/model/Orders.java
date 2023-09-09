package com.maestro.JDBCProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date nowDay;
//    private int customer_id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;
    private int amount;
    private String product_name;
}
