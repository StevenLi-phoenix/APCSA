/**
 * Representing Names

1.	Write a class Name that stores a person's first, middle, and last names and provides the following methods: 

¡¤	public Name(String first, String middle, String last)—constructor. The name should be stored in the case given; don't 
    convert to all upper or lower case. 

¡¤	public String getFirst()—returns the first name 

¡¤	public String getMiddle()—returns the middle name

¡¤	public String getLast()—returns the last name 

¡¤	public String firstMiddleLast()—returns a string containing the person's full name in order, e.g., "Mary Jane Smith".

¡¤	public String lastFirstMiddle()—returns a string containing the person's full name with the last name first followed by 
    a comma, e.g., "Smith, Mary Jane". 

¡¤	public boolean equals(Name otherName)—returns true if this name is the same as otherName. Comparisons should not be case
     sensitive. (Hint: There is a String method equalsIgnoreCase that is just like the String method equals except it does 
     not consider case in doing its comparison.) 

¡¤	public String initials()—returns the person's initials (a 3-character string). The initials should be all in upper case,
     regardless of what case the name was entered in. (Hint: Instead of using charAt, use the substring method of String to 
     get a string containing only the first letter—then you can upcase this one-letter string. See Figure 3.1 in the text for 
     a description of the substring method.) 

¡¤	public int length()—returns the total number of characters in the full name, not including spaces. 
 */

public class Name {
    private String first_name, middle_name, last_name;
    public  Name(String first, String middle, String last){first_name = first;middle_name = middle;last_name = last;}
    public  String   toString()                     {return firstMiddleLast();}
    public  String   getFirst()                     {return first_name;}
    public  String   getMiddle()                    {return middle_name;}
    public  String   getLast()                      {return last_name;}
    public  String   firstMiddleLast()              {return first_name+middle_name+last_name;}
    public  String   lastFirstMiddle()              {return last_name+first_name+middle_name;}
    public  boolean  equals(Name otherName)         {return firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast());}
    public  String   initials()                     {return first_name.substring(0, 1).toUpperCase() + middle_name.substring(0, 1).toUpperCase() + last_name.substring(0,1).toUpperCase();}
    public  int      length()                       {return firstMiddleLast().length();}
}
