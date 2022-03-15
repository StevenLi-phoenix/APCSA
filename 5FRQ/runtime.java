public class runtime{
    public static void main(String[] args) {
        /* SpinnerGame sp = new SpinnerGame();
         * System.out.println(sp.spin(100, 120));
         * while(true)
         * sp.playRound();
         */
        /* 
         * String s = "CCAAAAATTT!"; 
         * longestStreck(s);
         */
        //System.out.println(isSelfDivisor(128));
        //System.out.println(isSelfDivisor(120));
        //System.out.println((int)(-1.2+0.5));
        System.out.println("sing a song".indexOf("ng"));
    }
    public static void longestStreck(String str){
        int logestValue = -1, MAXacc=0;
        if(str != null){
            String longestString = str.substring(0,1);
            for(int i=0;i<str.length()-1;i++){
                if(str.substring(i, i+1).equals(str.substring(i+1, i+2))){
                    MAXacc += 1;
                }else{
                    if(MAXacc > logestValue){
                        logestValue = MAXacc;
                        longestString = str.substring(i-1, i);
                        MAXacc = 1;
                    }
                }
            }
            System.out.println(""+longestString+" "+logestValue);
        }
    }
    public static boolean Palindrome(String str){
        boolean re = true;
        for(int i = 0; i <= str.length()/2;i++){
            if(!str.substring(i,i+1).equals(str.substring(str.length()-i-1, str.length()-i))){
                re = false;
                break;
            }
        }
        return re;
    }
    public static boolean isSelfDivisor(int number){
        int Rnum = number;
        boolean stat = true;
        number /= 10; // must be here
        while(number>=1){
            if(number%10==0){stat=false;break;}
            if(Rnum%(number%10)!=0){
                stat = false;
                break;
            }
            number /= 10;
        }
        return stat;
    }
}   
