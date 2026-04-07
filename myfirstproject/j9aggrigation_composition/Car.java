package myfirstproject.j9aggrigation_composition;

public class Car {
    String name;
    int year;
    String color;
    Engine engine;
    Car(String name, int year, String color, String engineType){
        this.name = name;
        this.year = year;
        this.color = color;
        this.engine = new Engine(engineType);
    }

    void display(){
        System.err.printf("%s %s %d %s\n", color, name, year, engine.type);
    }
}
