package com.gorod.olga.adaptiveJava4;

import java.util.List;

/**
 * You have two classes: Employee (name: String, salary: Long) and Department (name: String, code: String, employees: List<Employee>). Both classes have getters for all fields with the corresponding names (getName(), getSalary(), getEmployees() and so on).
 * <p>
 * Write a method using Stream API that calculates the general number of employees with salary >= threshold for all departments whose code starts with string "111-" (without ""). Perhaps, flatMap method can help you to implement it.
 * <p>
 * Classes Employee and Department will be available during testing. You can define your own classes for local testing.
 * <p>
 * Important. Use the given template for your method. Pay attention to type of an argument and the returned value. Please, use only Stream API, no cycles.
 * <p>
 * Examples: there are 2 departments (in JSON notation) below and ﻿threshold = 20 000. The result is 1 (because there is only one suitable employee).
 * <p>
 * [
 * {
 * "name": "dep-1",
 * "code": "111-1",
 * "employees": [
 * {
 * "name": "William",
 * "salary": 20000
 * },
 * {
 * "name": "Sophia",
 * "salary": 10000
 * }
 * ]
 * },
 * {
 * "name": "dep-2",
 * "code": "222-1",
 * "employees": [
 * {
 * "name": "John",
 * "salary": 50000
 * }
 * ]
 * }
 * ]﻿﻿
 */

public class NumberOfEmployees {
    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream().filter(department -> department.getCode().startsWith("111-")).
                flatMap(department -> department.getEmployees().stream()).
                filter(employee -> employee.getSalary() >= threshold).count();
    }

}
class Employee {
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

class Department {
    String name, code;
    List<Employee> employees;

    Department(String name, String code, List<Employee> employees){
        this.name = name;
        this.code = code;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
