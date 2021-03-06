//Xavier Vaughn
package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;


//Test class
public class Test
{

	//Main string
public static void main(String[] args)
{
	//creates our first test set
	IntegerSet testSet1 = new IntegerSet();
	testSet1.add(1);
	testSet1.add(2);
	testSet1.add(3);
	//Checks to see if the numbers were properly added, as well as if the toString method works
	System.out.println("Test set 1 = " + testSet1.toString());
	
	//Checks to see if the length method works
	System.out.println("Test set 1 length = " + testSet1.length());
	
	IntegerSet testSet2 = new IntegerSet();
	testSet2.add(1);
	testSet2.add(2);
	testSet2.add(3);
	testSet2.add(4);
	testSet2.add(6);
	testSet2.add(7);
	
	//tests remove method
	System.out.println("Test set 2 = " + testSet2.toString());
	
	testSet2.remove(4);
	
	System.out.println("Removing the number 4 makes it: " + testSet2.toString());
	
	//checks the smallest int function
	System.out.println("Smallest number in the set: " + testSet2.smallest());
	
	//Checks the Largest int function
	System.out.println("Largest number in the set: " + testSet2.largest());
	
	 //Checks the contains function
	System.out.println("Does test set 2 contain the number 2? " + testSet2.contains(2));
	
	//New test set 3 with new data
	IntegerSet testSet3 = new IntegerSet();
	testSet3.add(9);
	testSet3.add(5);
	
	//Checking to see if testSet3 is empty
	System.out.println("Is test set 3 empty? " + testSet3.isEmpty());
	
	//Testing the clear function
	System.out.println("Integer set 3 is: " + testSet3.toString());
	
	
	testSet3.clear();
	
	System.out.println("Clearing this leads to: " + testSet3.toString());
	
	//Checking to see if testSet3 is empty
	System.out.println("Is test set 3 empty? " + testSet3.isEmpty());
	
	//Checking the Union of set 1 and set 2
	testSet1.union(testSet2);
	
	
}
}