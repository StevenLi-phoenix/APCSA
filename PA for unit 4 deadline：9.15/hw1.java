/**
 * HW for CSA courses
 * hw_a for 1
 * hw_b for 2
 * 
 * Author: Lishuyu
 * tiem: 2021/9/8
 */

import java.util.Scanner;

public class hw1
{
    public static void main(String[] args){
        hw_a();
        hw_b();
    }
    public static void hw_a(){
        int result = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n<0){n=scan.nextInt();}scan.close();
        while (n>0){result *= n;n--;}
        System.out.println(result);
    }
    public static void hw_b(){
        String contrl = "y";
        Scanner scan = new Scanner(System.in);
        while(contrl.equals("y")){
            int n = (int)(Math.random()*10);
            int guess = -1;
            int count = 0;
            int count_high = 0;
            int count_low = 0;
            while(guess!=n){
                guess = scan.nextInt();
                if(guess < n){System.out.println("小了");count_low++;}
                else if(guess > n){System.out.println("大了");count_high++;}
                count++;
            }
            System.out.println("congratulations!");
            System.out.println(""+count+";"+count_high+";"+count_low);
            System.out.println("Restart? [y|(n)]");
            contrl = scan.next();
        }
        scan.close();
    }
}
