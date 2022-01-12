public class Main{
    public static void main(String[] args) {
        System.out.println("Program started Main.main()");
        character Mom = new character();
        character Dad = new character("name");
        System.out.println(Mom.getName()); 
        System.out.println(Dad.getName());
    }
}
