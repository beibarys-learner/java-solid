package org.java.solid.liskov;

public class DeveloperKotlin extends Developer {

    // we closed Developer Class, then we modify DeveloperJava's writeCode function

    @Override
    public void writeCode() {
        System.out.println("use Kotlin syntax");
    }

    @Override
    public void reaction() {
        System.out.println("Kotlin Developer");
    }
}
