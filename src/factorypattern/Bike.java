package factorypattern;

public abstract class Bike {

    public Bike() {
    }

    public void ride() {

    }

    public void clean() {

    }

    public void race() {

    }

    public void ringBell() {
        System.out.println("Tring Tring");
    }

    public abstract int getWeightInKg();
    public abstract int getMaxSpeed();
    public abstract int getAmountOfGears();


    @Override
    public String toString() {
        return "Weight in kg: " + getWeightInKg() + " Max Speed: " + getMaxSpeed() + " amount of gears: " + getAmountOfGears();
    }

}
