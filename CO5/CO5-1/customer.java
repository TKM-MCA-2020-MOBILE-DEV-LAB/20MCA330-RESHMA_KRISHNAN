package com.example.sqlite_ins_sel;

public class Customer {
    private int id, age;
    private String name;
    private Boolean activeStatus;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Customer(int id, int age, String name, Boolean activeStatus) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
