/**
 * Xavier Vaughn
 * Assignment 2
 * Bernard Woolfolk
 * Large Scale Programming
 */
//Imports needed for the code as well as the package
package org.howard.edu.lsp.assignment2;
import java.util.ArrayList;


// Test class
public class Test
{

	//Main string
public static void main(String[] args)
	{
	
	// Instantiating the Implementation class to use the method it contains
	Implementation i = new Implementation();
	
	// Holds the sum that we are looking for
	int sum;
	
	//This is the arrayList used to store the data compared to each other to match the sum
	ArrayList<Integer> arrayListBaseNums1 = new ArrayList<Integer>();
	
	//The arrayList displayed to user
	ArrayList<Integer> arrayListSumsLocal = new ArrayList<Integer>();
	
	//Fills in the arraylist for the first time, with the numbers: 1,2,3,4, and 5. And sets the sum to 5
	arrayListBaseNums1.add(1);
	arrayListBaseNums1.add(2);
	arrayListBaseNums1.add(3);
	arrayListBaseNums1.add(4);
	arrayListBaseNums1.add(5);
	sum = 5;
	
	/* Sets the displayed arrayList equal to the returned list that is returned by the method which 
	*is passed the initialized arrayList and Sum
	*/
	arrayListSumsLocal = i.Combinations(arrayListBaseNums1, sum);
	
	System.out.println("The array list is: ");
	System.out.println(arrayListBaseNums1);
	
	System.out.println("The sum we are looking for is: " + sum);
	System.out.println("The numbers that add up to " + sum + " are: ");
	
		for(int iterator = 0; iterator < arrayListSumsLocal.size()-1;iterator+=2)
		{
			System.out.print(arrayListSumsLocal.get(iterator) + ",");
			System.out.println(arrayListSumsLocal.get(iterator+1));
		}
		
		// Second test case
		ArrayList<Integer> arrayListBaseNums2 = new ArrayList<Integer>();
		
		arrayListBaseNums2.add(1);
		arrayListBaseNums2.add(2);
		arrayListBaseNums2.add(3);
		
		sum = 3;
		
		arrayListSumsLocal = i.Combinations(arrayListBaseNums2, sum);
	
		System.out.println("The array list is: ");
		System.out.println(arrayListBaseNums2);
		
		System.out.println("The sum we are looking for is: " + sum);
		System.out.println("The numbers that add up to " + sum + " are: ");
		
			for(int iterator = 0; iterator < arrayListSumsLocal.size()-1;iterator+=2)
			{
				
				System.out.print(arrayListSumsLocal.get(iterator) + ",");
				System.out.println(arrayListSumsLocal.get(iterator+1));
			}
			// Second test case
			ArrayList<Integer> arrayListBaseNums3 = new ArrayList<Integer>();
			
			arrayListBaseNums3.add(1);
			arrayListBaseNums3.add(1);
			arrayListBaseNums3.add(1);
			
			sum = 7;
			
			arrayListSumsLocal = i.Combinations(arrayListBaseNums3, sum);
		
			System.out.println("The array list is: ");
			System.out.println(arrayListBaseNums3);
			
			System.out.println("The sum we are looking for is: " + sum);
			System.out.println("The numbers that add up to " + sum + " are: ");
			
				for(int iterator = 0; iterator < arrayListSumsLocal.size()-1;iterator+=2)
				{
					
					System.out.print(arrayListSumsLocal.get(iterator) + ",");
					System.out.println(arrayListSumsLocal.get(iterator+1));
				}
	//just ends the test method
return;
	}
}

