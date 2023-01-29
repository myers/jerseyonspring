package com.example.wstutorial;

import java.util.Collections;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello")
public class HelloWorldResource {

    @GET
    @Produces("application/json")
    public List<Employee> hello() {
        return Collections.singletonList(Employee.builder().firstName("myers").id(1).build());
    }
}