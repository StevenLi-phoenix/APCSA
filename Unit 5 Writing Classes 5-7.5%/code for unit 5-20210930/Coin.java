//********************************************************************
//  Coin.java       Author: Lewis and Loftus
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************

public class Coin
{
   public final int HEADS = 0;
   public final int TAILS = 1;

   private int face;

   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin ()
   {
      flip();
   }

   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face.
   //-----------------------------------------------------------------
   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as an integer.
   //-----------------------------------------------------------------
   public int getFace ()
   {
      return face;
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String faceName;

      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }
   //-----------------------------------------------------------------
   //  Returns true is the face of the coin is head.
   //-----------------------------------------------------------------
   public boolean isHeads()
   {
      if (face==0)
      return true;
      else 
      return false;
   }
}