/*******************************************************
 * AUTHOR: NEELANJANA DUTTA
 * DATE: JUNE 18, 2013
 * DESC: SORT AN INPUT STRING IN APHANUMERIC ORDER
 
 			 *  Class name: sortString
             *  Inheritance: none
             *  Attributes: inputString
             *  Methods:
             *  Functionality:
             *  Visibility:
*******************************************************/

/* MAIN CODE
 * System.out.println("Input is: " +args[0]);
		sortString ob = new sortString(args[0]);
		System.out.println("Sorted output is: " +ob.inputString);*/

import java.util.*;
import java.lang.String;

public class sortString {
String inputString;

/*******************************************************
 			 *  Method name: sortString [constructor]
             *  Inheritance:
             *  Attributes:
             *  Precondition:
             *  Postcondition:
             *  Functionality:
             *  Visibility:
             *  @param: String inputString
             *  @return: none
*******************************************************/
sortString(String inputString)
{
	char[] charArray = inputString.toCharArray();
	Arrays.sort(charArray);
	this.inputString = Arrays.toString(charArray); // this to mean member variable inputString of the object, 
												   // without this, the method's input variable will be considered 
	// System.out.println(inputString);
	//return(inputString);
}
}
