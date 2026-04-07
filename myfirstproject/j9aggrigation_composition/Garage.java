package myfirstproject.j9aggrigation_composition;

public class Garage {
    String name;
    int year;
    Car[] cars;

    Garage(String name, int year, Car[] cars){
        this.name = name;
        this.year = year;
        this.cars = cars;
    }

    void display(){
        System.out.printf("%s %d\n", name, year);
        System.out.println("Cars in garage: ");
        for(Car car: cars){
            car.display();
        }
    }
}
