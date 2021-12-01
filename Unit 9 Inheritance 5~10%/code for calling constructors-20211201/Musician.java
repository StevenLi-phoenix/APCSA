/**
 * 在这里给出对类 Musician 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Musician extends Performer
{
    // 实例变量 - 用你自己的变量替换下面的例子
 
    private String instrument  ;
    public Musician(){
        instrument = "piano";
    }
    public Musician(String inst){
        instrument = inst;
    }
    public Musician(String n,int a,String inst){
        super(n,a);
        instrument = inst;
    }
    public String getInstrument(){
        return instrument;
    }
    public String toString(){
        return "name: "+getName()+"\nage:  "+getAge()+" \ninstrument:  "+getInstrument();
    }
    
    public static void main(String[] args){
        
        Musician branford = new Musician("Saxophone");
        System.out.println(branford);
        //Musician branford1 = new Musician("Branford",20,"Saxophone");
        //System.out.println(branford1);
        
    }
}
