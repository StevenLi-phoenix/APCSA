/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
package pixLab.pixLab.picturelab;
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  /** Method to test grayscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  /** Method to test fixUnderwater */
  public static void testFixUnderwater(double sc)
  {
    // Picture water = new Picture("images/25754910_p0.png");
    Picture water = new Picture("images/water.jpg");
    water.explore();
    water.fixUnderwater(sc);
    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.mirrorVerticalRightToLeft();
    beach.explore();
  }
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture motorcycle = new Picture("images/redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
  }
  
  /** Method to test mirrorHorizontalBotToTop */
  public static void testMirrorHorizontalBotToTop()
  {
    Picture motorcycle = new Picture("images/redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  }

  /** Method to test mirrorDiagonal */
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    //snowman.jpg
    Picture snowman = new Picture("images/snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  /** Method to test mirrorGull */
  public static void testMirrorGull()
  {
    //seagull.jpg
    Picture snowman = new Picture("images/seagull.jpg");
    snowman.explore();
    snowman.mirrorGull();
    snowman.explore();
  }

  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test the partCopy method */
  public static void testPartCopy()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.createPartCollage();
    canvas.explore();
  }

  /** Method to test MyCollage */
  public static void testMyCollage()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.Mycollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testEdgeDetectionPro()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetectionPro();
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater(.5);
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();

    //testMirrorDiagonal();
    //A7
    //testMirrorTemple(); 
    //testMirrorArms();  
    //testMirrorGull();
    //A8
    //testCollage();
    //testPartCopy();
    //testMyCollage();
    //A9
    //testEdgeDetection();
    testEdgeDetectionPro();
    //DigitalPicture p = new DigitalPicture();
    //DigitalPicture p1 = new SimplePicture();
    //DigitalPicture p = new Picture();
    //SimplePicture p2 = new Picture();
    //Picture p3 = new SimplePicture();
    
  }
}
