package com.sda.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    List<String> carBrands = new ArrayList<>();

    public StreamOperations() {
        initializeList(carBrands);
    }

    List<Integer> convertToIntList() {
        return carBrands.stream()
                .map(carBrandString -> carBrandString.length())
                .collect(Collectors.toList());
    }

    private void initializeList(List<String> carBrands) {
        carBrands.add("Lamborghini");
        carBrands.add("Mercedes");
        carBrands.add("BMW");
        carBrands.add("Renault");
        carBrands.add("Dacia");
        carBrands.add("Bentley");
        System.out.println("List of Strings: " + carBrands);
    }
}
