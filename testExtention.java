public class testExtention {
    public static void main(String[] args) {
        base b = new extention();
        b.leap();
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
