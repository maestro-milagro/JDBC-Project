package com.maestro.JDBCProject.repository;

import com.maestro.JDBCProject.model.Order;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.catalina.valves.StuckThreadDetectionValve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
@Data
public class DataAccessObject {
//    private final String scriptFileName = "select.sql";
//    private final String scriptFileName = read("select.sql");
//    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @PersistenceContext
    private final EntityManager entityManager;

//    private static String read(String scriptFileName) {
//        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
//             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
//            return bufferedReader.lines().collect(Collectors.joining("\n"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public String getProductName(String name){
        return entityManager.createNativeQuery(String.format("SELECT product_name FROM orders LEFT JOIN customers ON orders.customer_id = customers.id WHERE LOWER(cus_name) = '%s'", name)).getResultList().toString();

//        Map<String, String> params = new HashMap<>();
//        params.put("name", name);
//        return namedParameterJdbcTemplate.query(
//                scriptFileName,
//                params,
//                (rs, rowNum) -> {
//                    String product_name = rs.getString("product_name");
//                    return new Order(product_name).getProduct_name();
//                }).toString();
    }
}
