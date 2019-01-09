package com.company.com;

public class ExceptionEmployee {
    public static void main(String[]args) throws EmployeeNotFoundException {
        int Employee_ID=123456;
        if (Employee_ID==12345) {
        } else {
            throw new EmployeeNotFoundException("Could not find Employee ID " + Employee_ID);
        }
    }
}

