
/**
 * 在这里给出对类 Performer 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Performer
{
    private String name;
    private int age;
    public Performer(){
        name = "I am a Performer";
        age = 16;
    }
    public Performer(String n,int a){
        name = n;
        age = a;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
