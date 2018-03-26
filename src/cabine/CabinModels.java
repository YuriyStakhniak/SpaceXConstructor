package cabine;

public enum  CabinModels {

    CAB1("cabine1", 5, 4, 5, 1),
    CAB2("cabine2", 6, 5, 6, 2),
    CAB3("cabine3", 7, 6, 7, 3),
    CAB4("cabine4", 8, 6, 8, 4),
    CAB5("cabine5", 9, 7, 9, 5);

    private String name;
    private int height;
    private int width;
    private int weight;
    private int capacity;

    CabinModels(String name, int height, int width, int weight, int capacity) {
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
}
