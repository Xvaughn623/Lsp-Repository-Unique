/**
 * Xavier Vaughn
 * Assignment 2
 * Bernard Woolfolk
 * Large Scale Programming
 */
//Imports needed for the code as well as the package
package org.howard.edu.lsp.assignment2;
import java.util.ArrayList;

// Implementation class where the data is used to find the needed goal
class Implementation{
	

// Method to use the arrayList and sum to find the numbers that add up to the sum in the arrayList
 public ArrayList<Integer> Combinations(ArrayList<Integer> ArrayListBaseNums, int sum )
	{
	 //Creates a new ArrayList to return so that none passed through are edited
	ArrayList<Integer> arrayListNums = new ArrayList<Integer>();
	
		//double for loop for comparing the two numbers and to see if they add up
		for(int i = 0; i < ArrayListBaseNums.size() - 1; i ++)
		{
			for (int j = i+1; j < ArrayListBaseNums.size(); j++) 
			{
				//If the numbers added up are equal to the sum, add them to the ArrayList
				
				if ((i+j) == sum)
				{
				arrayListNums.add(i);
				arrayListNums.add(j);
				}
				// If they are anything else but equal to the sum, continue the for loops.
				else 
				{
				continue;
				}
			}
		}
		//return the ArrayList of numbers that add up to the sum
	return arrayListNums;
	}

}