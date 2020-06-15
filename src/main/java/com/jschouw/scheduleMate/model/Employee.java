package com.jschouw.scheduleMate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int employeeId;
    String firstName;
    String insertion;
    String lastName;
    String employedAs;
    LocalDate startContract;
    LocalDate endContract;
    int hoursPerWeek;

    public Employee() {
    }

    public Employee(int employeeId, String firstName, String insertion, String lastName, String employedAs, LocalDate startContract, LocalDate endContract, int hoursPerWeek) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.insertion = insertion;
        this.lastName = lastName;
        this.employedAs = employedAs;
        this.startContract = startContract;
        this.endContract = endContract;
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getInsertion() {
        return insertion;
    }

    public void setInsertion(String insertion) {
        this.insertion = insertion;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployedAs() {
        return employedAs;
    }

    public void setEmployedAs(String employedAs) {
        this.employedAs = employedAs;
    }

    public LocalDate getStartContract() {
        return startContract;
    }

    public void setStartContract(LocalDate startContract) {
        this.startContract = startContract;
    }

    public LocalDate getEndContract() {
        return endContract;
    }

    public void setEndContract(LocalDate endContract) {
        this.endContract = endContract;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", insertion='" + insertion + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employedAs='" + employedAs + '\'' +
                ", startContract=" + startContract +
                ", endContract=" + endContract +
                ", hoursPerWeek=" + hoursPerWeek +
                '}';
    }
}
