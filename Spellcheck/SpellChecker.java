import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class SpellChecker {
  private ArrayList<String> dictionary;

  public SpellChecker() {
    String[] tmp = null;
    try {
      tmp = readLines("dictionary.txt");
    } catch (IOException e) {
      // Print out the exception that occurred
      System.out.println("Unable to access " + e.getMessage());
    }
    dictionary = new ArrayList<String>(Arrays.asList(tmp));
  }

  /**
   * This uses linear search to find a word in the dictionary ArrayList and also
   * prints out the number of words checked. If not found, word is misspelled.
   */
  public boolean linearSpellCheck(String word) {
    int count = 0;
    for (int i = 0; i < dictionary.size(); i++) {
      count++;
      if (word.equals(dictionary.get(i))) {
        System.out.println("LinearSearch:Number of words checked: " + count);
        return true;
      }
    }
    System.out.println("LinearSearch:Number of words checked: " + count);
    return false;

  }

  /**
   * This uses binary search to find a word in the dictionary ArrayList. If not
   * found, word is misspelled. ADD IN CODE TO COUNT and PRINT OUT THE NUMBER OF
   * WORDS CHECKED!
   */
  public boolean binarySpellCheck(String word) {
    int count = 0;

    int first = 0;
    int last = dictionary.size()-1;

    int bigger, middle_index;
    while(last!=first+1)
    { 
      middle_index = (int)((first+last)/2);
      bigger = word.compareTo(dictionary.get(middle_index));
      count ++;
      if(bigger > 0)
        first = middle_index;
      else if(bigger<0)
        last = middle_index;
      else if(bigger==0)
      { 
        System.out.println(count);
        return true;
      }
    }
    return false;
  }

  public boolean baseSpellCheck(String word){
    return dictionary.contains(word);
  }

  public static String[] readLines(String filename) throws IOException {
    FileReader fileReader = new FileReader(filename);

    BufferedReader bufferedReader = new BufferedReader(fileReader);
    List<String> lines = new ArrayList<String>();
    String line = null;

    while ((line = bufferedReader.readLine()) != null) {
      lines.add(line);
    }

    bufferedReader.close();

    return lines.toArray(new String[lines.size()]);
  }

}
