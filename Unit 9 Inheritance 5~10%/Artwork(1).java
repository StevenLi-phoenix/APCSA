class Artifact
{
    private String title;
    private int year;
    public Artifact(String t, int y)
    {
        title = t;
        year = y;
    }
    public void printInfo()
    {
        System.out.print(title + " (" + year + ")");
    }
}
public class Artwork extends Artifact
{
    private String artist;
    public Artwork(String t, int y, String a)
    {
        super(t, y);
        artist = a;
    }
    public void printInfo()
    {
    /* missing implementation */
        super.printInfo();
        System.out.print(" by " + artist);
    }
    
    public static void main(String[] args){
        Artwork starry = new Artwork("The Starry Night", 1889, "Van Gogh");
        starry.printInfo();
    }
}