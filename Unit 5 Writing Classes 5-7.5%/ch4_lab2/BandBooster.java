/**
 * models a band booster and use your class to update sales of band candy. 
 * 
 * 1.	Write the BandBooster class assuming a band booster object is described by two pieces of instance data: name (a String) and boxesSold (an integer that represents the number of boxes of band candy the booster has sold in the band fundraiser). The class should have the following methods: 
 * ¡¤	A constructor that has one parameter—a String containing the name of the band booster. The constructor should set boxesSold to 0. 
 * ¡¤	A method getName that returns the name of the band booster (it has no parameters). 
 * ¡¤	A method updateSales that takes a single integer parameter representing the number of additional boxes of candy sold. The method should add this number to boxesSold. 
 * ¡¤	A toString method that returns a string containing the name of the band booster and the number of boxes of candy sold in a format similar to the following: 
 * 
 *           Joe:  16 boxes
 * 
 * */

public class BandBooster {
    private String name;
    private int boxesSold;

    public BandBooster(String Bandname)
    {
        name = Bandname;
        boxesSold = 0;
    }

    public String getName()
    {
        return name;
    }

    public void updateSales(int additional)
    {
        boxesSold += additional;
    }

    public String toString()
    {
        return name + ": " + boxesSold + " boxes"; 
    }
}
