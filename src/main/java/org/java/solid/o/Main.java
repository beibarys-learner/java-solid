package org.java.solid.o;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new DeveloperJava();
        Developer dev2 = new Developer();

        List<Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);

        for (Developer dev: devList){
            dev.writeCode();
        }

    }
}
