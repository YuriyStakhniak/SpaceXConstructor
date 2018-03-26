
public enum Planets {

    MARS(1, "Mars"),
    JUPITER(4, "Jupiter"),
    SATURN(8, "Saturn"),
    URANUS(18, "Uranus"),
    NEPTUNE(29, "Neptune");

    private int distance;
    private String name;

    Planets(int distance, String name) {
        this.distance = distance;
        this.name = name;
    }

    public int getDistance() {return distance;}

    public String getName() {return name;}


}
