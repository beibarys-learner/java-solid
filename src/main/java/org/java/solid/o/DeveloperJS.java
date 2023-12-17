package org.java.solid.o;

public class DeveloperJS extends Developer {

    // we closed Developer Class, then we modify DeveloperJava's writeCode function

    @Override
    public void writeCode() {
        System.out.println("use JS syntax");
    }
}
