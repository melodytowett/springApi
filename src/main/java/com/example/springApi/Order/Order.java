package com.example.springApi.Order;

import ch.qos.logback.core.status.Status;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {
    private @Id @GeneratedValue Long id;
    private String description;
//    private Status status;

    public Order() {
    }

    public Order(Long id, String description, Status status) {
        this.id = id;
        this.description = description;
        //this.status = status;
    }

    public Order(String macBook_pro) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Status getStatus() {
//        return status;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Order))
            return false;
        Order order = (Order) o;
        return Objects.equals(this.id,order.id) && Objects.equals(this.description,order.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.description);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + this.id +
                  ", description='" + this.description + '\'' +
//                ", status=" + this.status +
                '}';
    }
//
//    public void setStatus(com.example.springApi.payroll.Status inProgess) {
//    }
}
