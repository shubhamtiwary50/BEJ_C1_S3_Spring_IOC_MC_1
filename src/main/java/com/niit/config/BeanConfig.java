package com.niit.config;

import com.niit.domain.Department;
import com.niit.domain.Employee;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Department getDepartment() {
        return new Department("IOC Department", "47");
    }

    @Bean
    public Employee getEmployee() {
        return new Employee(123, "Employee 234", "123/23 MG Road", getDepartment());
    }
}
