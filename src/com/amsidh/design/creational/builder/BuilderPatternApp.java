package com.amsidh.design.creational.builder;
//Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"
public class BuilderPatternApp {
    public static void main(String[] args) {
        Employee.EmployeeBuilder employeeBuilder = new Employee.EmployeeBuilder(123, "amsidh");

        Employee employee = employeeBuilder.build();
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeeId());

        Employee employee1 = employeeBuilder.withAge(37).build();
        System.out.println(employee1.getEmployeeName());
        System.out.println(employee1.getEmployeeId());
        System.out.println(employee1.getAge());

        Employee employee2 = employeeBuilder.withAge(37).withCity("Pune").withContactNumber(8108551845L).withEmailId("amsidh-babasha.lokhande@db.com").withCountry("India").withSalary(125L).withState("Maharashtra").build();
        System.out.println(employee2.getEmployeeName());
        System.out.println(employee2.getEmployeeId());
        System.out.println(employee2.getCity());
        System.out.println(employee2.getContactNumber());
        System.out.println(employee2.getEmailId());
        System.out.println(employee2.getState());
        System.out.println(employee2.getCountry());
        System.out.println(employee2.getAge());
        System.out.println(employee2.getSalary());

    }
}
