package com.amsidh.design.creational.builder;

public class Employee {

    //All final attributes
    private final Integer employeeId;  // required
    private final String employeeName;  // required
    private final Long salary; // optional
    private final String emailId; // optional
    private final Long contactNumber; // optional
    private final String city; // optional
    private final String state; // optional
    private final String country; // optional
    private final Integer age; // optional

    private Employee(Integer employeeId, String employeeName, Long salary, String emailId, Long contactNumber, String city, String state, String country, Integer age) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.city = city;
        this.state = state;
        this.country = country;
        this.age = age;
    }
    //All getter, and NO setter to provde immutability


    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Long getSalary() {
        return salary;
    }

    public String getEmailId() {
        return emailId;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", emailId='" + emailId + '\'' +
                ", contactNumber=" + contactNumber +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }

    public static class EmployeeBuilder {
        private final Integer employeeId;  // required
        private final String employeeName;  // required
        private Long salary; // optional
        private String emailId; // optional
        private Long contactNumber; // optional
        private String city; // optional
        private String state; // optional
        private String country; // optional
        private Integer age; // optional

        public EmployeeBuilder(Integer employeeId, String employeeName) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
        }

        //All Setter
        public EmployeeBuilder withSalary(Long salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder withEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public EmployeeBuilder withContactNumber(Long contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public EmployeeBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public EmployeeBuilder withState(String state) {
            this.state = state;
            return this;
        }

        public EmployeeBuilder withCountry(String country) {
            this.country = country;
            return this;
        }

        public EmployeeBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        //Return the finally consrcuted User object
        public Employee build() {
            return new Employee(employeeId, employeeName, salary, emailId, contactNumber, city, state, country, age);
        }
    }
}

