package com.sda.io;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {

    private String name;
    private int age;
    private Role role;

    // TODO: write correct string using annotation
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role=" + role +
                ", birthDate=" + birthDate.toString() +
                '}';
    }
}
