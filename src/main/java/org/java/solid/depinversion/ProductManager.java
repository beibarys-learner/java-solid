package org.java.solid.depinversion;

import org.java.solid.iinterfacesp.IDeveloper;

public class ProductManager implements IManager{
    @Override
    public void speak(IDeveloper developer) {
        System.out.println("manager talked with developer");
        developer.writeCOde();
    }

    @Override
    public void speak(DeveloperJava developer) {
        System.out.println("manager talked with Java developer");
        developer.writeCOde();
    }
    public void speak(DeveloperKotlin developer) {
        System.out.println("manager talked with Kotlin developer");
        developer.writeCOde();
    }


}
