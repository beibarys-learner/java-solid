package org.java.solid.o;

public class DeveloperJava extends Developer {

    // we closed Developer Class, then we modify DeveloperJava's writeCode function

    @Override
    public void writeCode() {
        System.out.println("use java syntax");
    }
}
