package com.sda.randomizer.write;

import java.util.List;

public interface DataLoader {
    List<String> readFromFile(String path);
}
