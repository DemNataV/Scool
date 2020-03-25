package Scool;

public class Director
        extends  People {
    public Director(String name, int age) {
        super(name, age);
    }

    void  beginClass(){
        System.out.println(name + " объявляет начало занятий");
    };

    void  endClass(){
        System.out.println(name + " объявляет окончание занятий");
    };
}
