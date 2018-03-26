package fuelTank;

public class FuelTank {

    private String name;
    private int height, weight, width, capacity;


    public FuelTank() {
    }

    public FuelTank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize (){
        return height*width;
    }
}
