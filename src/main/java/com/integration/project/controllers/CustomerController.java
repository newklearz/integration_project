package com.integration.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CustomerController
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/users")
    public List<Map<String, Object>> getCustomers()
    {
        String sql = "SELECT * FROM CUSTOMERS";
        return jdbcTemplate.queryForList(sql);
    }
}
