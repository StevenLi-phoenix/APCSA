package topic_4_moreExercise;

/**
 * LightBoard
 */
public class LightBoard {
    /** The lights on the board, where true represents on and false represents off. */ 
private boolean[][] lights; 

/** Constructs a LightBoard object having numRows rows and numCols columns. 
* Precondition: numRows > 0, numCols > 0 
* Postcondition: each light ha
*/
public LightBoard(int numRows, int numCols) 
{ 
    lights = new boolean[numRows][numCols];
    for(int i = 0; i < numRows; i++) {
        for(int j = 0; j < numCols; j++) {
            if(Math.random()<=0.4)
            lights[i][j] = true;
        }
    }
} 

/** Evaluates a light in row index row and column index col and returns a status * as described in part (b). 
* Precondition: row and col are valid indexes in lights. 
*/ 
public boolean evaluateLight(int row, int col) 
{ /* to be implemented in part (b) */ 
    int lights_on_of_col = 0;
    for(int i = 0; i<row;i++){
        lights_on_of_col += lights[i][col]?1:0;
    }
    if(lights[row][col] && lights_on_of_col%2==0)
        return false;
    else if(lights[row][col] && lights_on_of_col%3==0)
        return true;
    else
     return lights[row][col];
} 
// There may be additional instance variables, constructors, and methods not shown. 
}
