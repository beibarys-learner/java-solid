package org.java.solid.depinversion;

import org.java.solid.iinterfacesp.DeveloperJava;
import org.java.solid.iinterfacesp.DeveloperKotlin;
import org.java.solid.iinterfacesp.IDeveloper;

public class Main {
    public static void main(String[] args) {
        IDeveloper developer1 = new DeveloperJava();
        IDeveloper developer2 = new DeveloperKotlin();

        IManager manager = new ProductManager();
        manager.speak(developer1);
        manager.speak(developer2);

    }
}
