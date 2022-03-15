public class Meal {
    private String name;
    private Double cost;
    public Meal(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }
    public String toString() {
        return name + "meal, $" + cost;
    }
}
