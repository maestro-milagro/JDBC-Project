package com.maestro.JDBCProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString
public class Order {
    private int id;
    private Date NuyDate;
    private int customer_id;
    private String product_name;
    private int amount;

    public Order(String product_name){
        this.product_name = product_name;
    }
}
