public class combinedTable{
    public static void main(String[] args) {
        singleTable OUTTER = new singleTable();
        System.out.println(OUTTER.getTestText());
        OUTTER.setTestText("OUTSIDE");
        System.out.println(OUTTER.getTestText());

        combine combineA = new combine(OUTTER);
        combineA.printA();
        OUTTER.setTestText("Test change");
        combineA.printA();
        
    }
}
class combine{
    private singleTable A;
    public combine(singleTable A){
        this.A = A;
    }
    public void printA(){
        System.out.println(A.getTestText());
    }
}
class singleTable{
    private String test = "Initial";
    public singleTable(){
        test = "Constructor";
    }
    public void setTestText(String text){
        test = text;
    }
    public String getTestText(){
        return test;
    }
}
