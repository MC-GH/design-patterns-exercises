package factorypattern;

public class BikeService {
    public static void main(String[] args) {

        BikeFactory bf = new BikeFactory();
        Bike bike1 = bf.createBike("MOUNTAINBIKE");
        bike1.race();
        bike1.clean();

        System.out.println();

        Bike bike2 = bf.createBike("CITYBIKE");
        bike2.race();
        bike2.clean();
        bike2.ringBell();
    }
}
