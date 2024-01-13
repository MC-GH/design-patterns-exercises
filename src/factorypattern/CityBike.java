package factorypattern;

public class CityBike extends Bike{
    public CityBike(int weightInKg, int maxSpeedInKmH, int amountOfGears) {
        super(weightInKg, maxSpeedInKmH, amountOfGears);
    }

     @Override
    public void clean() {
         System.out.println("You clean your citybike, it's not very dirty.");
    }

    @Override
    public void race() {
        System.out.println("You try and race a colleague, but he is much faster.");
    }

}
