package com.education.ztu.humans;

public abstract class Person implements Human {
    protected int age;
    protected String firstName;
    protected String lastName;
    protected String fullInfo;
    protected Gender gender;
    protected Location location;

    {
        age = 0;
        firstName = "-";
        lastName = "-";
        fullInfo = firstName + " " + lastName;
        gender = Gender.valueOf("MALE");
        location = Location.RIVNE;
        fullInfo = "----";
    }

    public Person() {
    }


    public Person(int age, String firstName, String lastName, Gender gender, Location location) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.location = location;
        fullInfo = "My name is " + firstName + " " + lastName + " I am " + age + " years old. My gender is " + gender + " and I live in " + location + ". ";
    }

    // абстрактний метод
    public abstract void getOccupation();

    // оверрайд методів інтерфейса
    @Override
    public void sayAge() {
        System.out.println("I am " + age + " years old.\n");
    }

    @Override
    public void sayGender() {
        System.out.println(gender);//toString
    }

    @Override
    public void sayLocation() {
        System.out.println("I live in " + location + " .\n");
    }

    @Override
    public void sayName() {
        System.out.println("My name is " + firstName + " " + lastName);
    }


    @Override
    public String getFullInfo() {
        return fullInfo;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
