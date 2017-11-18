package com.example.helloSpring;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String sayHi(){
        return "Cześć "+getLastName();
    }

    public static List<Person> getExampleData(){
        List<Person> people=new ArrayList<>();
        people.add(new Person("Adam ","Kowalski"));
        people.add(new Person("Jan ","Nowak"));
        people.add(new Person("Seba ","Sebastian"));
        return people;
    }
    @Override
    public String toString() {
        return getFirstName() + "" + getLastName();
    }
}
