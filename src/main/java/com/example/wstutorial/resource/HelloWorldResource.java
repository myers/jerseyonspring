package com.example.wstutorial.resource;

import java.util.List;

import com.example.wstutorial.dao.EmployeeDao;
import com.example.wstutorial.entity.Employee;

import jakarta.inject.Inject;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello")
public class HelloWorldResource {

    @Inject
    EmployeeDao employeeDao;

    @GET
    @Produces("application/json")
    public List<Employee> hello(HttpSession session) {
        if (session != null) {
            Integer counter = (Integer) session.getAttribute("count");

            if (counter == null) {
                counter = 1;
            } else {
                counter++;
            }

            session.setAttribute("count", counter);
            System.out.println(session.getAttribute("count"));
        } else {
            System.out.println("no session");
        }

        return employeeDao.selectAll();
    }
}