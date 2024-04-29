package org.patterns.builder.employee;

public class EmployeeBuilder {
    private String name;
    private String surname;
    private String position;
    private int salary;
    private int age;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public EmployeeBuilder setPosition(String position) {
        this.position = position;
        return this;
    }

    public EmployeeBuilder setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Employee build() {
        return new Employee(name, surname, position, salary, age);
    }
}
