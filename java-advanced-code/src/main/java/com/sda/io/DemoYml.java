package com.sda.io;

import com.sda.io.util.ObjectFactory;

public class DemoYml {

    public static void main(String[] args) {
        // create a user - date string
        User user = ObjectFactory.createAUser();

        // create a student - date (java 7)
        Student student = ObjectFactory.createAStudent();

        // create a person - local date (java 8)
        Person person = ObjectFactory.createAPerson();

        CustomYmlWriter customYmlWriter = new CustomYmlWriter();
        customYmlWriter.write(student);
    }
}
