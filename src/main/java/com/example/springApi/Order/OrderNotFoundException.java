package com.example.springApi.Order;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException(Long id) {
        super("Could no find Orders" + id);
    }
}
