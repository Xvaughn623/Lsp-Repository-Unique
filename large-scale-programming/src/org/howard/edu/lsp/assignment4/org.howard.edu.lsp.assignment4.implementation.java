//Xavier Vaughn

package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.Collections;

class IntegerSet{
	//Creates a new Arraylist called set
	private ArrayList<Integer> set = new ArrayList<Integer>();
	
	// clears the ArraytList of all items in the said ArrayList
	public void clear()
	{
		set.clear();
	}
	
	//Gets the length of the ArrayList and returns it 
	public int length()
	{
		return set.size();
	}
	
	//Checks to see if the sets, or ArrayLists contain the same numbers
	public boolean equals(IntegerSet b)
	{
		ArrayList<Integer> setCompare1 = new ArrayList<Integer>();
		ArrayList<Integer> setCompare2 = new ArrayList<Integer>();
		
		setCompare1 = set;
		setCompare2 = b.set;
		
		boolean equal = false;
		if (set.size() != b.length())
		{
			equal = false;
		}
		else if(set.size() == b.length())
		{
			Collections.sort(setCompare1);
			Collections.sort(setCompare2);
			
			equal = setCompare1.equals(setCompare2);
			
		}
		return equal;
	}
	
	//Check to see if the Set contains a certain number value
	public boolean contains(int value)
	{
		boolean b;
		
		if (set.contains(value))
		{
			b = true;
		}
		else
		{
			b = false;
		}
		
		
		return b;
	}
	
	// gets the largest int in the set
	public int largest() throws IntegerSetException
	{
	
	int largest;

	if (set.isEmpty())
	{
		throw new IntegerSetException("The String is Empty, so largest int cannot be found");
	}
	
	
	else
	{
		largest = set.get(0);
		for (int i = 0; i < set.size(); i++)
		{
			if (largest < set.get(i))
			{
				largest = set.get(i);
			}
			else
			{
				continue;
			}
		}
	}
	return largest;
	}
	
	//gets the smallest int in the set
	public int smallest() throws IntegerSetException
	{
		int smallest;
		
		if (set.isEmpty())
		{
			throw new IntegerSetException("The String is Empty, so smallest int cannot be found");
		}
		
		else
		{
			smallest = set.get(0);
			for (int i = 0; i < set.size(); i++)
			{
				if (smallest > set.get(i))
				{
					smallest = set.get(i);
				}
				else
				{
					continue;
				}
			}
		}
		return smallest;
	}
	
	//adds an integer to the set if it is not already in the set
	public void add(int item) 
	{
		if (set.contains(item) != true)
		{
		set.add(item);
		}
		else
		{
			
		}
		return;
	}
	
	//removes an integer from the set if its in the set
	public void remove(int item)
	{
		if (set.contains(item) == true)
		{
			for (int i=0; i < set.size(); i++)
			{
				if(set.get(i) == item)
				{
					set.remove(i);
				}
				else
				{
					continue;
				}
		
			}
		}
		else
		{
		
		}
		return;
	}
	
	//combines two sets to make a new set with all the items from both sets
	public void union(IntegerSet intSetb)
	{
		IntegerSet set3 = new IntegerSet();
		String S3;
	for(int i= 0; i < set.size() ; i++)
	{
		set3.add(set.get(i));
		
	}
	for(int j= 0; j < intSetb.length() ; j++)
	{
		set3.add(intSetb.set.get(j));
		
	}
	
	
	S3 = set3.set.toString();
	
	System.out.println(S3);
	}
	
	// Prints out where the sets share numbers.
	public void intersect(IntegerSet intSetb) 
	{
		String S4;
		IntegerSet set4 = new IntegerSet();
		
		set4.set.addAll(set);
		set4.set.retainAll(intSetb.set);
		
		S4 = set4.set.toString();
		
		System.out.println(S4);
	}
	
	// Sees if the set is empty or not
	boolean isEmpty()
	{
		return set.isEmpty();
	}
	
	// gets and prints out the numbers that do not overlap in the sets;
	public void diff(IntegerSet intSetb)
	{
		String S5;
		IntegerSet set5 = new IntegerSet();
		
		set5.set.addAll(set);
		
		set5.set.removeAll(intSetb.set);
		
		S5 = set5.set.toString();
		
		System.out.println(S5);
		
	}
	
	public String toString()
	{
		return set.toString();
	}
	}
	
