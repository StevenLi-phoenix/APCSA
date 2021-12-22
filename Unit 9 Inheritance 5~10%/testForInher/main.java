public class main {
    public static void main(String[] args) {
        parent p = new children();
        children pc = new children();
        children cp = (children)p;
        parent pce = (parent)pc;
        cp.name();
        pce.name();
    }
}
