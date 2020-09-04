package com.example.demo.entites;

import java.util.Objects;

public class Person {
    private int age;
    private String Name;

    public Person(int age, String name) {
        this.age = age;
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(Name, person.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, Name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", Name='" + Name + '\'' +
                '}';
    }
}
