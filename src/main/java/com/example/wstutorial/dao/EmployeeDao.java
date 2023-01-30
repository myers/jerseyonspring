package com.example.wstutorial.dao;

import java.util.List;

import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.springframework.stereotype.Component;

import com.example.wstutorial.entity.Employee;

@UseClasspathSqlLocator
public interface EmployeeDao {
    @SqlQuery("listSorted")
    List<Employee> selectAll();
}