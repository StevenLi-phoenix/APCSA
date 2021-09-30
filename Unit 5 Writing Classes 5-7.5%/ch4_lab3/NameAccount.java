import java.util.Scanner;

/**
 * 2.	Now write a program TestNames.java that prompts for and reads in two names from the user (you'll need first, middle, 
    and last for each), creates a Name object for each, and uses the methods of the Name class to do the following: 
a.	For each name, print 
¡¤	first-middle-last version 
¡¤	last-first-middle version 
¡¤	initials 
¡¤	length 
b.	Tell whether or not the names are the same. 
 */

public class NameAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);scan.close(); //发现不需要scanner，仅仅活了一毫秒的scanner
        Name name1 = new Name("name1.first", "name1.middle", "name1.last");
        Name name2 = new Name("name2.first", "name2.middle", "name2.last");
        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name1.length());
        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println(name2.length());
    }
}
