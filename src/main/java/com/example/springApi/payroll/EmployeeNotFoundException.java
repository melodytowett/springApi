package com.example.springApi.payroll;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could no find employee" + id);
    }
}
