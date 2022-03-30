package unit3_review_and_extenitons.more_frq;

import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters. */
    private String openDel;
    private String closeDel;
    
    /** Constructs a Delimiters object where open is the open delimiter and close is the
    *  close delimiter.
    *  Precondition: open and close are non-empty strings.
    */
    public Delimiters(String open, String close)
    {
    openDel = open;
    closeDel = close;
    }
    
    /** Returns an ArrayList of delimiters from the array tokens, as described in part 	*(a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {  
        //returns an ArrayList containing all the open and close delimiters found in tokens in their original order.
        ArrayList<String> delimiters = new ArrayList<String>();
        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i].equals(openDel))
            {
                delimiters.add(openDel);
            }
            else if (tokens[i].equals(closeDel))
            {
                delimiters.add(closeDel);
            }
        }
        return delimiters;
    }
    
    /** Returns true if the delimiters are balanced and false otherwise, as described in 	*part (b).
    *  Precondition: delimiters contains only valid open and close delimiters.
    */
    public boolean isBalanced(ArrayList<String> delimiters)
    {  
        // returns true when the delimiters are balanced and returns false otherwise. The delimiters are balanced when both of the following conditions are satisfied; otherwise, they are not balanced.
        // 1. When traversing the ArrayList from the first element to the last element, there is no point at which there are more close delimiters than open delimiters at or before that point. 
        // 2. The total number of open delimiters is equal to the total number of close delimiters. 
        int balancedCount = 0;
        for (int i = 0; i < delimiters.size(); i++)
        {
            if (delimiters.get(i).equals(openDel))
            {
                balancedCount++;
            }
            else if (delimiters.get(i).equals(closeDel))
            {
                balancedCount--;
                // if balancedCount is negative, then there are more close delimiters than open delimiters.
                if (balancedCount < 0)
                {
                    return false;
                }
            }
        }
        // if balancedCount is not zero, then there are more open delimiters than close delimiters.
        if (balancedCount != 0)
        {
            return false;
        }
        return true;
    }
    
    // There may be instance variables, constructors, and methods that are not shown.
    
}
