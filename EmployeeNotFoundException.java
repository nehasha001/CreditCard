package com.company.com;

public class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(){
        super();
    }
    public EmployeeNotFoundException (String message){
        super("Employee ID is not valid");
    }
}
