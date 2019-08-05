package com.sda.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DependencyParser {

    public static final String GRADLE_DEPENDENCY_REGEX = "compile group: '(\\S*)', name: '(\\S*)', version: '(\\S*)'";

    // given compile group: 'mysql', name: 'mysql-connector-java', version: '8.0.17'
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // expect implementation 'mysql:mysql-connector-java:8.0.17'
        String shortFormDependency = convertToShortForm(input);
        System.out.println(shortFormDependency);
    }

    public static String convertToShortForm(String longDependency) {
        Pattern pattern = Pattern.compile(GRADLE_DEPENDENCY_REGEX);
        Matcher matcher = pattern.matcher(longDependency);
        matcher.find();

        String secondBlock = matcher.group(1);  // mysql
        String thirdBlock = matcher.group(2);   // mysql-connector-java
        String fourthBlock = matcher.group(3);  // 8.0.17

        // TODO: replace with string builder
        return "implementation '" + secondBlock + ":" + thirdBlock + ":" + fourthBlock + "'";
    }

}

