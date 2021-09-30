import java.util.Scanner;

/**
 *  2.	Write a program that uses BandBooster objects to track the sales of 2 band boosters over 3 weeks. Your program should do the following: 
 * ¡¤	Read in the names of the two band boosters and construct an object for each. 
 * ¡¤	Prompt for and read in the number of boxes sold by each booster for each of the three weeks.  Your prompts should include the booster's name as stored in the BandBooster object. For example, 
 * 
 * Enter the number of boxes sold by Joe this week:
 * 
 * For each member, after reading in the weekly sales, invoke the updateSales method to update the total sales by that member. 
 * ¡¤	After reading the data, print the name and total sales for each member (you will implicitly use the toString method here). 
 */

public class sale {
    public static void main(String[] args) {
        BandBooster people1 = new BandBooster("People1.name");
        BandBooster people2 = new BandBooster("People2.name");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of boxes sold by "+people1.getName()+" this week:");
        people1.updateSales(scan.nextInt());
        System.out.println(people1);
        System.out.println("Enter the number of boxes sold by "+people1.getName()+" this week:");
        people2.updateSales(scan.nextInt());
        System.out.println(people2);
        scan.close();
    }
}
