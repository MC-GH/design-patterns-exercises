package factorypattern;

public class MountainBike extends Bike {

    public MountainBike(int weightInKg, int maxSpeedInKmH, int amountOfGears) {
        super(weightInKg, maxSpeedInKmH, amountOfGears);
    }

    @Override
    public void clean() {
        System.out.println("You clean your mountainbike, there's a lot of mud!");
    }

    @Override
    public void race() {
        System.out.println("You try and race a colleague, you win :)!");
    }
}
