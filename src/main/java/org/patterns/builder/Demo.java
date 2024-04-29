package org.patterns.builder;

import org.patterns.builder.employee.Employee;
import org.patterns.builder.employee.EmployeeBuilder;

public class Demo {
    public static void main(String[] args) {
        EmployeeBuilder builder = new EmployeeBuilder();
        Employee employee = builder.setName("John")
                .setSurname("Doe")
                .setPosition("Software Engineer")
                .setSalary(1000)
                .setAge(25)
                .build();
        System.out.println(employee);
    }
}
