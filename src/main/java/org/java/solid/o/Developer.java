package org.java.solid.o;

public class Developer {
    private String langName;

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public void writeCode(){
        System.out.println("Default syntax");
/*        if(langName.equals("Java")){
            System.out.println("Write Java Syntax");
        } else if(langName.equals("Javascript")){
            System.out.println("Write JS Syntax");
        }*/
    }
    public void eat(){}
}

