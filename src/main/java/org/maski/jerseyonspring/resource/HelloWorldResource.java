package org.maski.jerseyonspring.resource;

import java.util.List;

import org.maski.jerseyonspring.dao.EmployeeDao;
import org.maski.jerseyonspring.entity.Employee;

import jakarta.inject.Inject;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import lombok.Builder;
import lombok.Data;

@Path("/hello")
public class HelloWorldResource {

    @Builder
    @Data
    static class EmployeeResponse {
        private Integer sessionCounter;
        private List<Employee> data;
    }

    @Inject
    EmployeeDao employeeDao;

    @GET
    @Produces("application/json")
    public EmployeeResponse hello(@Context HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        Integer counter = null;
        if (session != null) {
            counter = (Integer) session.getAttribute("count");

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

        return EmployeeResponse.builder().data(employeeDao.selectAll()).sessionCounter(counter).build();
    }
}