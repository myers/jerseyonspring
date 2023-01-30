package com.example.wstutorial.resource;

import java.util.List;

import com.example.wstutorial.dao.EmployeeDao;
import com.example.wstutorial.entity.Employee;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello")
public class HelloWorldResource {

    @Inject
    EmployeeDao employeeDao;

    @GET
    @Produces("application/json")
    public List<Employee> hello() {
        return employeeDao.selectAll();
        // return
        // Collections.singletonList(Employee.builder().firstName("myers").id(1).build());
    }
}