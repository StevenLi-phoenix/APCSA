import java.util.ArrayList;
import java.util.Collections;

public class SortedIntList extends IntList {

    private ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();
    public SortedIntList(int size) {
        super(size);
    }

    // @Override
    public void add(int value)
    {
        super.add(value);
        sortedArrayList.add(value);
        Collections.sort(sortedArrayList);
    }

    public String toString(){
        for(int i:sortedArrayList)
        {
            System.out.println(i);
        }
        return "";
    }
}
