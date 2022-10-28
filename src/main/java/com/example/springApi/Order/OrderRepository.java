package com.example.springApi.Order;

import com.example.springApi.Order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<Order,Long> {
}
