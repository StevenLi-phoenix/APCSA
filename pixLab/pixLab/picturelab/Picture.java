import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.time.chrono.MinguoChronology;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

import javax.management.MBeanAttributeInfo;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to keep only the blue in a picture */
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  /** Method to negate all pixels in a picture */
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }
  
  /** Method to change a picture to grayscale */
  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        int avg = (int)pixelObj.getAverage();
        pixelObj.setBlue(avg);
        pixelObj.setGreen(avg);
        pixelObj.setRed(avg);
      }
    }
  }
  
  /** Method to fix the underwater picture */
  public void fixUnderwater(double sc)
  {
    Pixel[][] pixels = this.getPixels2D();
    Double[][][] picture_array = new Double[pixels.length][pixels[0].length][3];
    int sum_Red = 0, sum_Green = 0, sum_Blue = 0;
    double max_Blue = 0, min_Blue = 255, max_Green = 0, min_Green = 255, max_Red = 0, min_Red = 255;
    double avg_Red, avg_Green, avg_Blue;
    int count = 0;
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        count++;
        sum_Red += pixelObj.getRed();
        sum_Green += pixelObj.getGreen();
        sum_Blue += pixelObj.getBlue();
      }
    }
    avg_Blue = sum_Blue/count;
    avg_Green = sum_Green/count;
    avg_Red = sum_Red/count;
    
    for(int row = 0; row < pixels.length;row++)
    {
      for(int col = 0; col<pixels[0].length; col++)
      {
        picture_array[row][col][0] = (double)pixels[row][col].getRed();
        picture_array[row][col][1] = (double)pixels[row][col].getBlue();
        picture_array[row][col][2] = (double)pixels[row][col].getGreen();
      }
    }

    for(int row = 0; row < pixels.length;row++)
    {
      for(int col = 0; col<pixels[0].length; col++)
      {
        Pixel pixelObj = pixels[row][col];
        picture_array[row][col][0] = Math.pow(Math.abs((int)(avg_Red - pixelObj.getRed())),sc);
        picture_array[row][col][1] = Math.pow(Math.abs((int)(avg_Blue - pixelObj.getBlue())),sc);
        picture_array[row][col][2] = Math.pow(Math.abs((int)(avg_Green - pixelObj.getGreen())),sc);
        if(picture_array[row][col][1] > max_Blue){max_Blue = picture_array[row][col][1];}
        if(picture_array[row][col][1] < min_Blue){min_Blue = picture_array[row][col][1];}
        if(picture_array[row][col][2] > max_Green){max_Green = picture_array[row][col][2];}
        if(picture_array[row][col][2] < min_Green){min_Green = picture_array[row][col][2];}
        if(picture_array[row][col][0] > max_Red){max_Red = picture_array[row][col][0];}
        if(picture_array[row][col][0] < min_Red){min_Red = picture_array[row][col][0];}
      }
    }

    for(int row = 0; row < pixels.length;row++)
    {
      for(int col = 0; col<pixels[0].length; col++)
      {
        Pixel pixelObj = pixels[row][col];
        double coef_R = 255/(max_Red-min_Red);
        double coef_B = 255/(max_Blue-min_Blue);
        double coef_G = 255/(max_Green-min_Green);
        pixelObj.setRed((int)((picture_array[row][col][0]-min_Red)*coef_R));
        pixelObj.setBlue((int)((picture_array[row][col][1]-min_Blue)*coef_B));
        pixelObj.setGreen((int)((picture_array[row][col][2]-min_Green)*coef_G));
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from right to left */
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
    * horizontal mirror in the center of the picture
    * from top to bottom */
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < pixels.length / 2; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
    * horizontal mirror in the center of the picture
    * from top to bottom */
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < pixels.length / 2; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }

  /** mirrorDiagonal */
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int square = 0;
    if(pixels.length > pixels[0].length){square = pixels[0].length;}
    else{square = pixels.length;}
    for (int row = 0; row < square; row++)
    {
      for (int col = 0; col < square; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[col][row];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }

  /** copy part of picture down */
  public void mirrorArms()
  {
    int moveDistance = 40;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 158; row < 198; row++)
    {
      for (int col = 106; col < 172; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[row + moveDistance][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    // loop through the rows
    for (int row = 171; row < 195; row++)
    {
      for (int col = 237; col < 291; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[row + moveDistance][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }
  
  /** mirrorGull mirror part of picture*/
  public void mirrorGull()
  {
    int mirrorPoint = 338;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 234; row < 324; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 236; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic,int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    * @param endRow the end row to copy to
    * @param endCol the end col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol, int endRow, int endCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         (fromRow < endRow && fromRow < fromPixels.length) &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           (fromCol < endCol && fromCol < fromPixels[0].length) &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }

   /** Method to create a collage of several pictures */
   public void createPartCollage()
   {
     Picture flower1 = new Picture("images/flower1.jpg");
     Picture flower2 = new Picture("images/flower2.jpg");
     this.copy(flower1,0,0,50,50);
     this.copy(flower2,100,0,150,50);
     this.copy(flower1,200,0,250,50);
     Picture flowerNoBlue = new Picture(flower2);
     flowerNoBlue.zeroBlue();
     this.copy(flowerNoBlue,300,0,350,50);
     this.copy(flower1,400,0,450,50);
     this.copy(flower2,500,0,550,50);
     this.mirrorVertical();
     this.write("collage.jpg");
   }

  /** Method Mycollage */
  public void Mycollage()
  {
    Picture flower1 = new Picture("images/flower1.jpg");
    this.copy(flower1,0,0);
    this.copy(flower1,100,0);
    this.copy(flower1,200,0);
    this.mirrorVertical();
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel botPixel = null;
    Pixel topPixel_copy = null;
    Pixel botPixel_copy = null;

    Pixel[][] pixels = this.getPixels2D();
    Pixel[][] pixels_copy = this.getPixels2D();
    Color rightColor = null;
    Color botColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0;col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    for (int col = 0;col < pixels[0].length; col++)
    {
      for (int row = 0; row < pixels.length-1; row++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[row+1][col];
        topPixel_copy = pixels_copy[row][col];
        botPixel_copy = pixels_copy[row+1][col];
        botColor = botPixel_copy.getColor();
        if (topPixel_copy.colorDistance(botColor) > edgeDist)
        topPixel.setColor(Color.BLACK);
      }
    }
    /** Methid that new  */


  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
    }
  
} // this } is the end of class Picture, put all new methods before this
