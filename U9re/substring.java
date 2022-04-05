package U9re;
public class substring {
    public static void mys(String s){
        if(s.length()>1){
            mys(s.substring(2));
            System.out.print(s.substring(0, 1));
        }
    }
    public static void main(String[] args) {
        mys("computer");
    }
}
