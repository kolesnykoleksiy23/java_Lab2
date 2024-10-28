package com.education.ztu.humans;

public class Teacher extends Person {

    public static int counter;
    private String university;
    private String subject;
    private Car car;

    public Teacher() {
        super();
        counter++;
    }

    public Teacher(int age, String firstName, String lastName, Gender gender, Location location, String university, String subject) {
        super(age, firstName, lastName, gender, location);
        this.university = university;
        this.subject = subject;
        fullInfo = "My name is " + firstName + " " + lastName + " I am " + age + " years old. " + gender + " and I live in " + location + ". I am working in " + university + ", as " + subject + " teacher \n";
        counter++;
    }

    public Teacher(String University, String subject, Car car) {
        this.university = University;
        this.subject = subject;
        this.car = car;
        this.fullInfo = "I am a teacher in " + university + ", I am " + subject + " teacher, and I have " + car.getBrand();
        counter++;
    }

    public static int showCounter() {
        return counter;
    }

    @Override
    public void getOccupation() {
        System.out.println("I am " + subject + " teacher in " + university);
    }

    @Override
    public String getFullInfo() {
        return fullInfo;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
        this.fullInfo = fullInfo + "My car is "+ car.getBrand();
    }
}
