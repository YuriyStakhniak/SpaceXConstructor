package cabine;

public class Cabin {

    private String name;
    private int height;
    private int width;
    private int weight;
    private int capacity;

    public Cabin(String name, int height, int width, int weight, int capacity) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.capacity = capacity;
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

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Cabin{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                ", capacity=" + capacity +
                '}';
    }
}

