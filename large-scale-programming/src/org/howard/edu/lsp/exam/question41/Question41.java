package org.howard.edu.lsp.exam.question41;
import java.util.*;

class Question41{
	ArrayList<Integer> removeZeroes(ArrayList<Integer> al)
	{
		
		for (int i = 0; i < al.size(); i++)
		{
			if(al.get(i) == 0)
			{
				al.remove(i);
				i +=-1;
			}
			else
			{
				continue;
			}
		}
		return al;
		
	}
	
	//removes all 0's from an arraylist
	
	void print(ArrayList<Integer> al){
		System.out.print("Test ArrayList: [");
		for (int i = 0; i < al.size(); i++)
		{
			System.out.print("" + al.get(i) + ",");
		}
		System.out.println("]");
		}
	}
	// Method ONLY for testing the remove zeroes function
