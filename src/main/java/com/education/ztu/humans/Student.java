package com.education.ztu.humans;

public class Student extends Person {

    public static int counter;
    private String university;
    private String speciality;
    private int course;

    public Student() {
        super();
        counter++;
    }

    public Student(int age, String firstName, String lastName, Gender gender, Location location, String university, String speciality, int course) {
        super(age, firstName, lastName, gender, location);
        this.university = university;
        this.speciality = speciality;
        this.course = course;
        fullInfo = "My name is " + firstName + " " + lastName + " I am " + age + " years old. " + gender + " and I live in " + location + ". I am studying in " + university + ", my major is " + speciality + " on " + course + " course \n";
        counter++;
    }

    public Student(String university, String speciality, int course) {
        this.university = university;
        this.speciality = speciality;
        this.course = course;
        this.fullInfo = "I am a studying in " + university + ", I am " + course + " year student, and my major is " + speciality;
        counter++;
    }

    public static int showCounter() {
        return counter;
    }

    @Override
    public void getOccupation() {
        System.out.println("I am student, my major is " + speciality + " my course " + course);
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
