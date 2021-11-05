import java.util.Collections;

public class ArrayVerify{
    public static void main(String[] args) {
        //System.out.println(checkString(new String[]));
        System.out.println(checkString(new String[0]));
        String[] str = {"cat", "dog"};
        System.out.println(checkString(str));
    }
    public static int checkString(String[] arr){
        int count = 0;
        for (int k = 0; k < arr.length; k++){
            if (arr[k].length() >= 3){
                count++;
            }
        }
        return count;
    }
}
