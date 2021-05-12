package com.example.springbootjpa.course;

import com.example.springbootjpa.Employee.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Courses {

    @Id
    int courseid;
    String coursename;
    String author;
    String cost;

    @ManyToOne
    private Employee employee;

    public Courses(int courseid, String coursename, String author, String cost, int empid) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.author = author;
        this.cost = cost;

        this.employee = new Employee(empid,"","","");
    }

    public Courses() {
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String empname) {
        this.coursename = empname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String designation) {
        this.author = designation;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String salary) {
        this.cost = salary;
    }

    public Employee getEmployee(){
        return employee;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }
}