package factorypattern;

public abstract class Bike {
    private int weightInKg;
    private int maxSpeedInKmH;
    private int amountOfGears;

    public Bike(int weightInKg, int maxSpeedInKmH, int amountOfGears) {
        this.weightInKg = weightInKg;
        this.maxSpeedInKmH = maxSpeedInKmH;
        this.amountOfGears = amountOfGears;
    }

    public abstract void clean();

    public abstract void race();

    public void ringBell() {
        System.out.println("Tring Tring");
    }

}
