package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    boolean lovesCats;
    String location;

    public Person(String firstName, String lastName, int age, double height, boolean lovesCats, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.lovesCats = lovesCats;
        this.location = location;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(double height, boolean lovesCats, String location) {
        this.height = height;
        this.lovesCats = lovesCats;
        this.location = location;

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public String toString() {
        return  "First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Age: " + age +
                ", Height: " + height +
                ", Loves Cats: " + lovesCats +
                ", Location: " + location;
    }

}
