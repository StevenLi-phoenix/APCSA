import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

/**
 * StevenLI
 * CSA HW2
 */
public class hw2 {
    public static void main(String[] args) {
        //System.out.print("Hello world");
        //function1();
        function2();
    }

    public static void function1() {
        int input, result;
        input = -1;
        result = 0;
        Scanner scan = new Scanner(System.in);
        while(input<0){
        input = scan.nextInt();
        if(input==0){result=0;}else if(input<0){System.out.println("input<0; retry");}else{result=1;}
        }
        scan.close();
        while(input>0){
            result *= input;
            input--;
        }
        System.out.println(result);
    }

    public static void function2(){
        int control = 1;
        while(control==1){
        String phrase;    // a string of characters
      	int countBlank;   // the number of blanks in the phrase 
      	int length;       // the length of the phrase
      	char ch;          // an individual character in the string
        int countA, countE, countS, countT;
        countA = countE = countS = countT = 0;

		Scanner scan = new Scanner(System.in);

      	// Print a program header
      	System.out.println ();
      	System.out.println ("Character Counter");
      	System.out.println ();

      	// Read in a string and find its length
      	System.out.print ("Enter a sentence or phrase: ");
      	phrase = scan.nextLine();
        if(phrase.equals("exit")){
            break;
        }
      	length = phrase.length();

      	// Initialize counts
      	countBlank = 0;

      	// a for loop to go through the string char by char
      	// and count the blank spaces
        int i = length;
        for(i=0;i<length;i++){
            char item = phrase.charAt(i);
            System.out.println(item);
            switch(item){
                case 'a':
                case 'A': countA++;break;
                case 'e':
                case 'E':countE++;break;
                case 't':
                case 'T':countT++;break;
                case 's':
                case 'S':countS++;break;
                case ' ':countBlank++;break;
            }
        }

      	// Print the results
      	System.out.println ();
        System.out.println ("Number of blank spaces: " + countBlank);
      	System.out.println ("a:"+countA);
        System.out.println("e:"+countE);
        System.out.println("s:"+countS);
        System.out.println("t:"+countT);
        }
        scan.close();
    }
}
