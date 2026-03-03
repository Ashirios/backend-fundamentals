package com.example.users;

public class Employee  extends Person{

    private String employeeId;
    private String title;

    public Employee(String name, String gender, int age) {
        super(name, gender, age);
    }
    
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    

}
