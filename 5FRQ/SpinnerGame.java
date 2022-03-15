public class SpinnerGame
{
/** Precondition: min < max
* Simulates a spin of a spinner by returning a random integer
* between min and max, inclusive.
*/
public int spin(int min, int max)
{ 
    int result;
    result = (int) (Math.random() * (max - min + 1) + min);
 	return result;
 }
 
/** Simulates one round of the game as described in part (b).
*/
public void playRound()
{ 
    int p = spin(1,10);
    int c = spin(2,8);
    if(p>c)System.out.println("you win " + (p-c) + " points");
    else if(p<c)System.out.println("you lose " + (p-c) + " points");
    else if(p==c){
        int p2 = spin(1,10);
        int c2 = spin(2,8);
        if(p2>c2)System.out.println("you win 1 points");
        else if(p2<c2)System.out.println("you lose -1 points");
        else if(p2==c2)System.out.println("tie 0 points");
    };
 }
}
