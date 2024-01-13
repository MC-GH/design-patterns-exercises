package factorypattern;

public class BikeFactory {

    public Bike createBike (String type) {
        if(type == null) return null;

        switch(type.toUpperCase()) {
            case "CITYBIKE":
                return new CityBike(20,22,10);
            case "MOUNTAINBIKE":
                return new MountainBike(15,28,22);
            default:
                throw new IllegalArgumentException("Unknown bike type " + type);
        }
    }
}
