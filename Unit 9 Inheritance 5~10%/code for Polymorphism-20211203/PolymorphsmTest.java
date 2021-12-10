
/**
 * 在这里给出对类 PolymorphsmTest 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class PolymorphsmTest
{
    public static void main(String[] args){
        WritingUtensil[] pencilCase = new WritingUtensil[3];
        pencilCase[0] = new Pen();
        pencilCase[1] = new GelPen();
        pencilCase[2] = new Marker();
        
        for(WritingUtensil wu:pencilCase )
            wu.write("Hello!");
         
    }
}
