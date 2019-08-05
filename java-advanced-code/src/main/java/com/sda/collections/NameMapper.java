package com.sda.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameMapper {

    public List<String> getFirstNames(List<String> names) {
        List<String> firstNameList = new ArrayList<>();
        for (String name : names) {
            int emptySpaceIndex = name.indexOf(' ');
            String firstName = name.substring(0, emptySpaceIndex);
            String lastName = name.substring(emptySpaceIndex);
            if (firstNameList.contains(firstName)) {
                char lastNameInitial = lastName.charAt(1);
                firstNameList.add(firstName + " " + lastNameInitial);
//                firstNameList.indexOf()
            } else {
                firstNameList.add(firstName);
            }
        }
        return firstNameList;
    }

    public Map<Integer, String> mapNames(List<String> fileLines) {

        Map<Integer, String> map = new HashMap<>();
        int i = 0;
        for (String names : fileLines) {
            map.put(i, names);
            i++;
        }
        return map;
    }
}
