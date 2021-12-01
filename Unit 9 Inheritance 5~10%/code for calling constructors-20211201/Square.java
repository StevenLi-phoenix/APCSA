import javax.print.attribute.standard.Sides;

// see instruction.txt for reference

// 1. Make the class square inherit from Rectangle
public class Square extends Rectangle
{
    private int side;
     // 2. Add a Square no-argument constructor
    public Square(){}
     // 3. Add a Square constructor with 1 argument for a side
    public Square(int side_o){side=side_o;}
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(3,5);
        r.draw();
        // 4. Uncomment these to test
        Square s1 = new Square();
        s1.draw();
        Square s = new Square(3);
        s.draw();
    }
     
}
