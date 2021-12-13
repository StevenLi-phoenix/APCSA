public class SortedIntList extends IntList {
    public SortedIntList(int size) {
        super(size);
        //TODO Auto-generated constructor stub
    }

    // @Override
    public void add(int value)
    {
        super.add(value);
        System.out.println("Override");
    }
}
