package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String birthPlace;
    String sex;
    String eyeColor;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String birthPlace, String sex, String eyeColor) {
        this(firstName, lastName, age);
        this.birthPlace = birthPlace;
        this.sex = sex;
        this.eyeColor = eyeColor;
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
        return age < 19 && age >= 13;
    }

}
