package topic_4_moreExercise;

public class ArrayTester {
    /** Returns an array containing the elements of column c of arr2D in the same order as
    * they appear in arr2D.
    * Precondition: c is a valid column index in arr2D.
    * Postcondition: arr2D is unchanged.
    */
    public static int[] getColumn(int[][] arr2D, int c)
    { 
        int[] column = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            column[i] = arr2D[i][c];
        }
        return column;
    }

    /** Returns true if and only if every value in arr1 appears in arr2.
    * Precondition: arr1 and arr2 have the same length.
    * Postcondition: arr1 and arr2 are unchanged.
    */
    public static boolean hasAllValues(int[] arr1, int[] arr2)
    { /* implementation not shown */ 
        return false;
    }

    /** Returns true if arr contains any duplicate values;
    * false otherwise.
    */
    public static boolean containsDuplicates(int[] arr)
    { /* implementation not shown */ 
        return false;
    }

    /** Returns true if square is a Latin square as described in part (b);
    * false otherwise.
    * Precondition: square has an equal number of rows and columns.
    *
    square has at least one row.
    */
    public static boolean isLatin(int[][] square)
    { 
        if (containsDuplicates(getColumn(square, 0))) {
            return false;
        }
        for (int i = 0; i < square[0].length; i++) {
            if (!hasAllValues(square[i], getColumn(square, i))) {
                return false;
            }
        }
        // for col
        for (int i = 0; i < square.length; i++) {
            if (!hasAllValues(square[i], square[0])) {
                return false;
            }
        }
        return true;
    }
}
