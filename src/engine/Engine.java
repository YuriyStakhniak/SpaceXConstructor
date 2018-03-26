package engine;

import fuelTank.FuelTank;

public class Engine {

    private String name;
    private int height;
    private int width;
    private int weigh;
    private int fuelConsumption;
    private int fuelTankSpace;
    private int power;
    private int timeToOrbitalSpeed;
    private int timeToEscapeVelocity;
    private FuelTank fuelTank;

    public Engine() {

    }

    public Engine(String name) {
        this.name = name;
    }

    public Engine(String name, FuelTank fuelTank) {
        this.name = name;
        this.fuelTank = fuelTank;
    }

    public Engine(String name, int height, int width,
                  int weigh, int fuelConsumption, int fuelTankSpace,
                  int power, int timeToOrbitalSpeed, int timeToEscapeVelocity, FuelTank fuelTank) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.weigh = weigh;
        this.fuelConsumption = fuelConsumption;
        this.fuelTankSpace = fuelTankSpace;
        this.power = power;
        this.timeToOrbitalSpeed = timeToOrbitalSpeed;
        this.timeToEscapeVelocity = timeToEscapeVelocity;
        this.fuelTank = fuelTank;
    }

    public int sizeCalculation() {
        return height * weigh;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeigh() {
        return weigh;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelTankSpace() {
        return fuelTankSpace;
    }

    public int getPower() {
        return power;
    }

    public int getTimeToOrbitalSpeed() {
        return timeToOrbitalSpeed;
    }

    public int getTimeToEscapeVelocity() {
        return timeToEscapeVelocity;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", fuelTank=" + fuelTank +
                '}';
    }
}