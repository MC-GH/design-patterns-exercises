package factorypattern;

public class CityBike extends Bike{
    private int weightInKg;
    private int maxSpeed;
    private int amountOfGears;
    public CityBike(int weightInKg, int maxSpeed, int amountOfGears) {
        this.weightInKg = weightInKg;
        this.maxSpeed = maxSpeed;
        this.amountOfGears = amountOfGears;
    }

    @Override
    public void ride() {
        super.ride();
    }

    @Override
    public void clean() {
        super.clean();
    }

    @Override
    public void race() {
        super.race();
    }

    @Override
    public int getWeightInKg() {
        return this.weightInKg;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getAmountOfGears() {
        return this.amountOfGears;
    }
}
