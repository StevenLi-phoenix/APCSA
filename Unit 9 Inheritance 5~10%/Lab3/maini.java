public class maini {
    public static void main(String[] args) {
        One var1 = new Two();
        One var2 = new Three();
        One var3 = new Four();
        Three var4 = new Four();
        Object var5 = new Three();
        Object var6 = new One();

        
        
        System.out.println("_________");
        var1.method1();
        
        System.out.println("_________");
        var2.method1();
        
        System.out.println("_________");
        var3.method1();
        
        System.out.println("_________");
        var4.method1();
        
        System.out.println("_________");
        // var5.method1();
        
        System.out.println("_________");
        // var6.method1();

        System.out.println("_________");

        
        System.out.println("_________");
        var4.method2();
        
        System.out.println("_________");
        // var4.method3();

        System.out.println("_________");

        
        System.out.println("_________");
        // ((Two)var1).method2(); 

        System.out.println("_________");

        
        System.out.println("_________");
        // ((Three)var1).method2();

        System.out.println("_________");

        
        System.out.println("_________");
        ((Two)var1).method3();  

        System.out.println("_________");

        
        System.out.println("_________");
        //((Four)var2).method1(); 

        System.out.println("_________");

        
        System.out.println("_________");
        ((Four)var3).method1(); 

        System.out.println("_________");

        
        System.out.println("____4-3_____");
        ((Four)var4).method3(); 

        System.out.println("_________");

        
        System.out.println("_________");
        ((One)var5).method1();  

        System.out.println("_________");

        
        System.out.println("_________");
        // ((Four)var5).method2(); 

        System.out.println("_________");

        
        System.out.println("____kkk_____");
        ((Three)var5).method2();

        System.out.println("_________");

        
        System.out.println("____6`_____");
        ((One)var6).method1();  

        System.out.println("_________");

        
        System.out.println("_________");
        // ((One)var6).method2();  

        System.out.println("_________");

        
        System.out.println("_________");
        // ((Two)var6).method3();

    }
}
