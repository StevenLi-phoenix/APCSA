
public class CheckDigit{ 
    /** Returns the check digit for num, as described in part (a). 
    * Precondition: The number of digits in num is between one and 
    * six, inclusive. 
    * num >= 0 
    */ 
    public static int getCheck(int num) 
    { 
    /* to be implemented in part (a) */ 
    /*

    Two helper methods, getNumberOfDigits and getDigit, have been provided. 
    § getNumberOfDigits returns the number of digits in its int parameter. 
    § getDigit returns the nth digit of its int parameter. 

    me: ???

    int acc = 0, i = 6;
    while(num >= 1){
        // maybe false
        acc += num%10 * i;
        i--;
        num = num / 10;
    }
    return acc%10;

    */
    int acc= 0, i = 6;
    for(i=6;i>6-getNumberOfDigits(num);i--){
        acc = acc + getDigit(num, getNumberOfDigits(num) - i) * i;
    }
    return acc;
    //where is (b) ?
    } 
    /** Returns true if numWithCheckDigit is valid, or false 
    * otherwise, as described in part (b). 
    * Precondition: The number of digits in numWithCheckDigit 
    * is between two and seven, inclusive. 
    * numWithCheckDigit >= 0 
    */ 
    public static boolean isValid(int numWithCheckDigit) 
    { 
    return numWithCheckDigit % 10 == getCheck(numWithCheckDigit/10); // 个位验证 == 其他位置的验证码
    } 
    /** Returns the number of digits in num. */ 
    public static int getNumberOfDigits(int num) 
    { 
    /* implementation not shown */ 
    return -1;
    } 
    /** Returns the nthdigit of num. 
    * Precondition: n >= 1 and n <= the number of digits in num 
    */ 
    public static int getDigit(int num, int n) 
    { 
    /* implementation not shown */ 
    return -1;
    } 
    // There may be instance variables, constructors, and methods not shown. 

    public static void main(String[] args) {
        System.out.println(getCheck(2183));
    }

    }
    