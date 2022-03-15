public class DeluxeMeal extends Meal {
    public DeluxeMeal(String name, String name2, String name3, double cost) {
        super(name, cost + 3);
    }
    public String toString() {
        return "deluxe" + super.toString();
    }
}
