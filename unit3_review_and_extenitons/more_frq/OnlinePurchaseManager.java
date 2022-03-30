package unit3_review_and_extenitons.more_frq;

import java.util.ArrayList;

// The Gizmo class represents gadgets that people purchase. Some Gizmo objects are electronic and others are not. A partial definition of the Gizmo class is shown below.
class Gizmo {
    // private varible for name of the manufacturer of the Gizmo
    private String manufacturer;
    // private varible for whether the Gizmo is electronic or not
    private boolean electronic;
    // constructor for a String manufacturer and a boolean electronic
    public Gizmo(String manufacturer, boolean electronic) {
        this.manufacturer = manufacturer;
        this.electronic = electronic;
    }
    /** Returns the name of the manufacturer of this Gizmo. */ 
    public String getMaker() 
    {
        return manufacturer;
    } 

    /** Returns true if this Gizmo is electronic, and false 
    * otherwise. 
    */ 
    public boolean isElectronic() 
    {
        return electronic;
    } 

    /** Returns true if this Gizmo is equivalent to the Gizmo 
    * object represented by the 
    * parameter, and false otherwise. 
    */ 
    public boolean equals(Object other) 
    {
        if (other == null)
        {
            return false;
        }
        if (other.getClass() != this.getClass())
        {
            return false;
        }
        Gizmo otherGizmo = (Gizmo) other;
        return manufacturer.equals(otherGizmo.manufacturer);
    }  
}

public class OnlinePurchaseManager 
{ 
/** An ArrayList of purchased Gizmo objects, 
* instantiated in the constructor. 
*/ 
private ArrayList<Gizmo> purchases; 
/** Returns the number of purchased Gizmo objects that are electronic 
* whose manufacturer is maker
*/
public int countElectronicsByMaker(String maker) 
{
    int count = 0;
    for (int i = 0; i < purchases.size(); i++)
    {
        if (purchases.get(i).isElectronic() && purchases.get(i).getMaker().equals(maker))
        {
            count++;
        }
    }
    return count;
} 

/** Returns true if any pair of adjacent purchased Gizmo objects are 
* equivalent, and false otherwise 
*/ 
public boolean hasAdjacentEqualPair() 
{
    for (int i = 0; i < purchases.size() - 1; i++)
    {
        if (purchases.get(i).equals(purchases.get(i + 1)))
        {
            return true;
        }
    }
    return false;
} 

// main method for testing
public static void main(String[] args) 
{
    // create lot of Gizmo objects and put it in purchases
    ArrayList<Gizmo> purchases = new ArrayList<Gizmo>();
    purchases.add(new Gizmo("ABC", true));
    purchases.add(new Gizmo("ABC", false));
    purchases.add(new Gizmo("XYZ", true));
    purchases.add(new Gizmo("lmnop", false));
    purchases.add(new Gizmo("ABC", true));
    purchases.add(new Gizmo("ABC", false));
    // test countElectronicsByMaker
    OnlinePurchaseManager manager = new OnlinePurchaseManager();
    manager.purchases = purchases;
    System.out.println(manager.countElectronicsByMaker("ABC"));
    // test hasAdjacentEqualPair
    System.out.println(manager.hasAdjacentEqualPair());
}

}
