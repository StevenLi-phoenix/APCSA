public class testExtention {
    public static void main(String[] args) {
        base b = new extention();
        b.leap();

        int ctrl = 691;
        if(ctrl>0)
            if(ctrl%2==0)
                System.out.println("Even");
        else
            System.out.println("Invalid");
    }
}

class base{
    public void leap(){
        System.out.println("base leap");
    }
}

class extention extends base{
    public void getTestText(){
        System.out.println("extention leap");
    }
}
