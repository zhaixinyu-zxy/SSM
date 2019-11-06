package com.baizhi.entity;

public class User {
    private String id;
    private String username;
    private double salary;
    private  int age;

    public User() {
    }

    public User(String id, String username, double salary, int age) {
        this.id = id;
        this.username = username;
        this.salary = salary;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
