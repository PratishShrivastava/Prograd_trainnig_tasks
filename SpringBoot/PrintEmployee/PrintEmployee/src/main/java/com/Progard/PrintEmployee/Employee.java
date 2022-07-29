package com.Progard.PrintEmployee;

public class Employee {
    String fname;
    String sname;
    int salary;

    public Employee(String fname, String sname, int salary){
        this.fname = fname;
        this.sname = sname;
        this.salary = salary;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
