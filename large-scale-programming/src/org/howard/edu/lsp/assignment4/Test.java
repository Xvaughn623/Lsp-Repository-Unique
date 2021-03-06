//Xavier Vaughn
package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;


//Test class
public class Test
{

	//Main string
public static void main(String[] args) throws IntegerSetException
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
	try {
		System.out.println("Smallest number in the set: " + testSet2.smallest());
	} catch (IntegerSetException e) {
		
		System.out.println(e);
	}
	
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
	
	//reprints out the two sets so user can see what is being compared to
	System.out.println("Test set 2 = " + testSet2.toString());
	System.out.println("Test set 1 = " + testSet1.toString());
	
	//Checking the Union of set 1 and set 2
	System.out.println("The Union of set1 and set2");
	testSet1.union(testSet2);
	
	//Checking the intersect of set1 and set2
	System.out.println(" The Intersect of set1 and set2");
	testSet1.intersect(testSet2);
	
	//Checking the Difference of set 1 and set 2
	System.out.println(" The difference of set1 and set2");
	testSet1.diff(testSet2);
	
	//Checking the Difference of set 2 and set 1
	System.out.println(" The difference of set2 and set1");
	testSet2.diff(testSet1);
		
	//tests the exceptions in the smallest and largest functions
	IntegerSet testSet4 = new IntegerSet();
	try
	{
		System.out.println("Smallest number in set 4: " + testSet4.smallest());
	}
		
	catch(Exception e)
	{
		System.out.println(e);
	}
		
		

	try
	{
		System.out.println("largest number in set 4: " + testSet4.largest());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	//Checks the equal function
	IntegerSet testSet5 = new IntegerSet();
	testSet5.add(9);
	testSet5.add(10);
	testSet5.add(11);
	testSet5.add(12);
	System.out.println("Set 5: " + testSet5.toString());
	
	IntegerSet testSet6 = new IntegerSet();
	testSet6.add(9);
	testSet6.add(10);
	testSet6.add(11);
	testSet6.add(12);
	System.out.println("Set 6: " + testSet6.toString());
	//Should be same as they are the exact same
	System.out.println("Set 5 and 6 are equal: " + testSet5.equals(testSet6));
	
	IntegerSet testSet7 = new IntegerSet();
	testSet7.add(10);
	testSet7.add(9);
	testSet7.add(12);
	testSet7.add(11);
	System.out.println("Set 7: " + testSet7.toString());
	//Should be same even though they are out of order
	System.out.println("Set 6 and 7 are equal: " + testSet6.equals(testSet7));
	
	IntegerSet testSet8 = new IntegerSet();
	testSet8.add(9);
	testSet8.add(10);
	testSet8.add(11);
	testSet8.add(12);
	testSet8.add(13);
	System.out.println("Set 8: " + testSet8.toString());
	//Should be different as a new number is introduced.
	System.out.println("Set 7 and 8 are equal: " + testSet7.equals(testSet8));
		
}
		
}
