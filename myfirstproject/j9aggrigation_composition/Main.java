public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Tata Sierra", 2025, "Black", "1.5 TGDi Hyperion");
        Car car2 = new Car("Mahindra XUV700", 2021, "Blue", "2.2-litre mHawk");
        Car car3 = new Car("Force Gurkha", 2024, "Red", "FM 2.6-litre CR");

        Car[] cars = {car1, car2, car3};

        Garage garage = new Garage("Delhi Expert Garage", 1994, cars);

        garage.display();
    }
}
