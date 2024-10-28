package com.education.ztu;

import com.education.ztu.humans.Employee;
import com.education.ztu.humans.Person;
import com.education.ztu.humans.Student;
import com.education.ztu.humans.Teacher;
import com.education.ztu.humans.Car;
import com.education.ztu.humans.Gender;
import com.education.ztu.humans.Location;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher(44, "Olga", "Petrenko", Gender.FEMALE, Location.ZHYTOMYR, "Zhytomyrska Politechnika", "C#");
        Car car = new Car("Mercedes-Benz");
        teacher.setCar(car);
        System.out.println(teacher.getFullInfo());
        teacher.getOccupation();
        teacher.getCar().engineIsRunning();
        teacher.getCar().startCar();
        teacher.getCar().engineIsRunning();
        teacher.getCar().stopCar();

        System.out.println("\n----Another teacher:----\n");
        Teacher teacher1 = new Teacher("Zhytomyrska Politechnika", "Math", new Car("Lada"));
        System.out.println(teacher1.getFullInfo());
        teacher1.getOccupation();

        System.out.println("We create teachers objects: " + Teacher.showCounter());


        System.out.println("-------Student ---------:");
        Student student1 = new Student(19, "Oleksiy", "Kolesnyk", Gender.MALE, Location.ZHYTOMYR, "Zhytomyrska Politechnika", "Software engineer", 3);
        System.out.println(student1.getFullInfo());
        student1.getOccupation();
        System.out.println("We create students objects: " + Student.showCounter());
        student1.sayGender();


        System.out.println("-----Employee ------:");
        Employee employee = new Employee(55, "Andriy", "Hardworker", Gender.NEUTER, Location.KYIV, "Genesis", "Senior Engineer");
        System.out.println(employee.getFullInfo());
        employee.getOccupation();
        System.out.println("We create employee objects: " + Employee.showCounter());



        System.out.println("----- Dynamic Casting -----");
        Person tech = (Person) teacher;
        Person stud = (Person) student1;
        Person empl = (Person) employee;
        tech.getOccupation();
        stud.getOccupation();
        empl.getOccupation();
        if (tech instanceof Teacher) {
            System.out.println("tech is a Teacher");
        }
        if (tech instanceof Person) {
            System.out.println("tech is a Person");
        }
    }
}