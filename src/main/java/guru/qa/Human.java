package guru.qa;

import java.lang.reflect.Constructor;

//суперкласс
public class Human {

    private static String country = "СССР";

    String name;
    int age;



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void born(){
        System.out.println("Я родился");
    }

    static void sayCountry(){
        System.out.println(country);
    }

}
