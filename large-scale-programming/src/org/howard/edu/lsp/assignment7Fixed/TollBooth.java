package org.howard.edu.lsp.assignment7Fixed;
 
interface truck
{

	
	public int weightTons = 0;
	
	public int numOfAxles = 0;
	
}
//interface for truck

interface tollBooth
{
	
	public Receipt calculateToll(truck t, Receipt r);
	
	public void displayTotals(Receipt r);
	
	public Receipt displayAndReset (Receipt r);
	
	
}
//interface for toll booth

class Receipt
{
	
	public int numOfTrucks;
	
	public int totalReceipts;
	
	Receipt(int a, int b)
	{
		numOfTrucks = a;
		
		totalReceipts = b;
	}
	

}


class OmahaTollBooth implements tollBooth
{
	
	
	public void displayTotals(Receipt r)
	//try returning a class
	{
		System.out.println("Totals since the last collection - Receipts: $" + r.totalReceipts + "Trucks" + r.numOfTrucks);
		
	}
	//displays the totals of the receipts;
	
	public Receipt displayAndReset(Receipt r)
	{		
		System.out.println("***Collecting Receipts***");
		
		displayTotals(r);
		
		r.numOfTrucks = 0;
		r.totalReceipts = 0;
		return r;
	}
	//Calls the Display totals function and resets the receipts to zero
	
	public Receipt calculateToll(truck t, Receipt r)
	{
		int toll = 0;
		
		//Receipt rTemp = new Receipt(0,0);
		
		toll = (((truck.weightTons*2) *10) + toll);
		
		toll = ((truck.numOfAxles *5) + toll);
		
		r.totalReceipts = toll;
		r.numOfTrucks = 1; 
		System.out.print("Total weight = " + truck.weightTons + " Number of Axles = " + truck.numOfAxles + "toll due: " + toll);
		
		return r;
	}
	
}

class NissanTruck implements truck
{
	
	
	public int weightTons;
	
	public int numOfAxles;
	
	NissanTruck(int t, int a)
	//t = tons, a = axles
	{
		this.weightTons  = t;
		this.numOfAxles = a;
	}
}
//The class for a Nissan brand Truck

class FordTruck implements truck
{
	
	
	public int weightTons;
	
	public int numOfAxles;
	
	FordTruck(int t, int a)
	{
		this.weightTons = t;
		
		this.numOfAxles = a;
	}
}
// The class for a Ford brand truck

