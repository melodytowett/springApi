package com.example.springApi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    public Employee() {
    }

    public Employee(String meloTowett, String backend) {
    }

    public Long getId() {
        return id;
    }

    public Employee(Long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return getId().equals(employee.getId()) && Objects.equals(getName(), employee.getName()) && getRole().equals(employee.getRole());
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.name,this.role);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
