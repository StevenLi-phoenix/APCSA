//********************************************************************
//  Num.java       
//
//  Represents a single integer as an object.
//********************************************************************

public class Num
{
    private int value;

    //-----------------------------------------------------------------
    //  Sets up the new Num object, storing an initial value.
    //-----------------------------------------------------------------
    public Num (int update)
    {
        value = update;
    }

    public Num max (Num a, Num b)
    {
        if (a.value>b.value)
            return a;
        else
            return b;
    }   

    public Num max (Num b)
    {
        if (value>b.value)
            return this;
        else
            return b;
    }  

    // //-----------------------------------------------------------------
    //  Sets the stored value to the newly specified value.
    //-----------------------------------------------------------------
    public void setValue (int update)
    {
        value = update;
    }

    //-----------------------------------------------------------------
    //  Returns the stored value.
    //-----------------------------------------------------------------
    public int getValue ()
    {
        return value;
    }

    //-----------------------------------------------------------------
    //  Returns the stored integer value as a string.
    //-----------------------------------------------------------------
    public String toString ()
    {
        return value + "";
    }
}
