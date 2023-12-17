package org.java.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new DeveloperJava();
        Developer dev2 = new Developer();

        List<Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);

        public static void showReaction(List<Developer> devList) {

            for (Developer dev : devList) {
                // bad example of writing
    /*        if(dev instanceof DeveloperJava){
                System.out.println("care about multithreading");
            } else (dev instanceof DeveloperJS){
                System.out.println("care about async");
            }*/

                dev.reaction(); // будет вызываться нужная реализация объекта и в которой универсальная функция сможет вызывать с любыми типами

            }
        }

    }
}
