package org.java.solid.liskov;

public class DeveloperJS extends Developer {

    // we closed Developer Class, then we modify DeveloperJava's writeCode function

    @Override
    public void writeCode() {
        System.out.println("use JS syntax");
    }

    @Override
    public void reaction() {
        System.out.println("JS reaction");
    }
}
