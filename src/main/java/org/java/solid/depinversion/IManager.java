package org.java.solid.depinversion;

import org.java.solid.iinterfacesp.IDeveloper;

public interface IManager {

    void speak(IDeveloper developer); // better option so IManager can talk with any developer

    void speak(DeveloperJava developer); // bad option because IManager depends on DeveloperJava

}
