package com.revature.dao;

import com.revature.models.Employee;
import com.revature.models.Level;

import java.util.List;

public interface EmployeeDAO {
    Employee getByUsername(String employeeUsername);


    Employee createEmployee(String employeeFirstname, String employeeLastname, String employeeUsername, String employeePassword);

    Employee updateEmployeeAccess(String username, Level newAccess);

    List<Employee> viewAllEmployees();



    //Employee demoteEmployee(String username);


}
