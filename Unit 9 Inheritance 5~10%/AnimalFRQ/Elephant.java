public class Elephant extends Herbivore {
    private Double tusks_long;
    public Elephant(String iiidn, Double tusks_long)
    {
        super("Elephant", iiidn);
        this.tusks_long = tusks_long;
    }
    public String toString()
    {
        return super.toString() + " with tusks " + tusks_long + " meters long";
    }
}
