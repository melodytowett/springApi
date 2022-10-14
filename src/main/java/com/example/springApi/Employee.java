package com.example.springApi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String role;

    public Employee() {
    }

    public Employee(String meloTowett, String backend) {
    }

    public Long getId() {
        return id;
    }

    public Employee(Long id, String firstName,String lastName, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){return firstName;}

    public void setName(String firstName) {
        this.firstName = firstName;
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
        return getId().equals(employee.getId()) && Objects.equals(getFirstName(), employee.getFirstName())&& Objects.equals(getLastName(), employee.getLastName()) && getRole().equals(employee.getRole());
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.firstName,this.lastName,this.role);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + firstName + '\'' +
                ",lastName='"+lastName+
                ", role='" + role + '\'' +
                '}';
    }
}
