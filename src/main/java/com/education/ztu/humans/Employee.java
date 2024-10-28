package com.education.ztu.humans;

public class Employee extends Person {

    public static int counter;
    private String company;
    private String position;
    private Car car;

    public Employee() {
        super();
        counter++;
    }

    public Employee(int age, String firstName, String lastName, Gender gender, Location location, String company, String position) {
        super(age, firstName, lastName, gender, location);
        this.company = company;
        this.position = position;
        fullInfo = "My name is " + firstName + " " + lastName + " I am " + age + " years old. " + gender + " and I live in " + location + ". I am working in " + company + ", as " + position;
        counter++;
    }

    public Employee(String company, String position, Car car) {
        this.company = company;
        this.position = position;
        this.car = car;
        this.fullInfo = "I am working in " + company + ", I am " + position + "and I have " + car.getBrand();
        counter++;
    }

    public static int showCounter() {
        return counter;
    }

    @Override
    public void getOccupation() {
        System.out.println("I am " + position + " in " + company);
    }

    @Override
    public String getFullInfo() {
        return fullInfo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
        this.fullInfo = fullInfo + "My car is "+ car.getBrand();
    }
}
