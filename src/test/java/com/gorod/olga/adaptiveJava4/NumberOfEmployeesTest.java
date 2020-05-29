package com.gorod.olga.adaptiveJava4;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static com.gorod.olga.adaptiveJava4.NumberOfEmployees.calcNumberOfEmployees;
import static org.junit.Assert.*;

public class NumberOfEmployeesTest {

    @Test
    public void testCalcNumberOfEmployees() {
        ArrayList<Department> arDep = new ArrayList<>();
        arDep.add(new Department("Town", "111-242",  new ArrayList<Employee>()));
        arDep.add(new Department("Village", "111-2422",  new ArrayList<Employee>()));
        arDep.add(new Department("Fake", "5111-242",  new ArrayList<Employee>()));
        arDep.add(new Department("Authority", "111",  new ArrayList<Employee>()));
        arDep.get(0).getEmployees().add(new Employee("Fedor", 15000));
        arDep.get(0).getEmployees().add(new Employee("Lev", 22000));
        arDep.get(0).getEmployees().add(new Employee("Oksana", 35000));
        arDep.get(1).getEmployees().add(new Employee("Ursula", 25000));
        arDep.get(1).getEmployees().add(new Employee("Bayan", 33000));
        arDep.get(1).getEmployees().add(new Employee("Fedorina", 32000));
        arDep.get(2).getEmployees().add(new Employee("Vasiliy", 29000));
        arDep.get(2).getEmployees().add(new Employee("Gennady", 28000));
        arDep.get(2).getEmployees().add(new Employee("Sergey", 29000));
        arDep.get(3).getEmployees().add(new Employee("Vladimir", 249000));
        arDep.get(3).getEmployees().add(new Employee("Michael", 128000));
        arDep.get(3).getEmployees().add(new Employee("Valentina", 329000));
        Assert.assertEquals(2, calcNumberOfEmployees(arDep, 33000));
    }

}