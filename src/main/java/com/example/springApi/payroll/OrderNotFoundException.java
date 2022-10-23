package com.example.springApi.payroll;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException(Long id) {
        super("Could no find Orders" + id);
    }
}
