package factorypattern;

public class App {
    public static void main(String[] args) {

        Bike cityBike = new CityBike(15,25,10);
        cityBike.ringBell();
        System.out.println(cityBike.toString());
    }
}
