package com.hengomaru.transReport.dataProducer.entity;

public class Employee {
    public Employee(){}

    public Employee(int id){
        this.id = id;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
