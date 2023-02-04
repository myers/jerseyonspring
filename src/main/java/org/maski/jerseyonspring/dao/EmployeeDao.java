package org.maski.jerseyonspring.dao;

import java.util.List;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import org.maski.jerseyonspring.entity.Employee;

@UseClasspathSqlLocator
@RegisterBeanMapper(Employee.class)
public interface EmployeeDao {
    @SqlQuery("listSorted")
    List<Employee> selectAll();
}