package com.sda.io.util;

import com.sda.io.Person;
import com.sda.io.Role;
import com.sda.io.Student;
import com.sda.io.User;

import java.time.LocalDate;
import java.util.Date;

public class ObjectFactory {

    public static Person createAPerson() {
        Person person = new Person();
        person.setAge(25);
        person.setName("alex");
        person.setBirthDate(LocalDate.now());
        person.setRole(Role.USER);
        return person;
    }

    public static User createAUser() {
        User user = new User();
        user.setAge(25);
        user.setName("alex");
        user.setBirthDate(DateUtils.convertLocalDateToString(LocalDate.now()));
        user.setRole(Role.USER);
        return user;
    }

    public static Student createAStudent() {
        Student student = new Student();
        student.setAge(25);
        student.setName("alex");
        student.setBirthDate(new Date());
        student.setRole(Role.USER);
        return student;
    }
}
