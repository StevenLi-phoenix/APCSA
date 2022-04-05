package topic_4_moreExercise;

public class test_lightBoard {
    public static void main(String[] args) {
        LightBoard lb = new LightBoard(7, 5);
        // test lb.evaluateLight() method
        System.out.println("lb.evaluateLight()");
        System.out.println(lb.evaluateLight(1,2));
        System.out.println(lb.evaluateLight(2,2));
        System.out.println(lb.evaluateLight(3,2));
        System.out.println(lb.evaluateLight(4,2));
        System.out.println(lb.evaluateLight(5,2));
    }
}
