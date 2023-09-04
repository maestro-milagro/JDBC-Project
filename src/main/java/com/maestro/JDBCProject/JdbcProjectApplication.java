package com.maestro.JDBCProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@SpringBootApplication
public class JdbcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcProjectApplication.class, args);
	}

}
