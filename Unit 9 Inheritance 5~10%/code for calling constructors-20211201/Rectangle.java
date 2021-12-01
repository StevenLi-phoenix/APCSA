class Rectangle
{
    private int length;
    private int width;

    public Rectangle()
    {
       length = 1;
       width = 1;
    }

    public Rectangle(int l, int w)
    {
       length = l;
       width = w;
    }

    public void draw()
    {
      for(int i=0; i < length; i++)
      {
         for(int j=0; j < width; j++)
             System.out.print("* ");
          System.out.println();
      }
      System.out.println();
    }

}
