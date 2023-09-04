package com.maestro.JDBCProject.controller;

import com.maestro.JDBCProject.repository.DataAccessObject;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class Controller {
    private final DataAccessObject dataAccessObject;

    @Autowired
    public Controller(DataAccessObject dataAccessObject){
        this.dataAccessObject = dataAccessObject;
    }
    @GetMapping("/products/fetch-product")
    public String getProductByName(@RequestParam String name){
        return dataAccessObject.getProductName(name);
    }

}
