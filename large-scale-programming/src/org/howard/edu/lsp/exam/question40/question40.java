package org.howard.edu.lsp.exam.question40;

abstract class Animal{
	
	String animalName = "Animal";
	
	String speak()
	{
		String s;
		s = "This " + animalName + " speaks";
		System.out.println(s);
		return s;
	}
	
	String move()
	{
		String m;
		m = "This " + animalName + " moves";
		System.out.println(m);
		return m;
	}
	/*Animal()
	{
		speak();
		move();
	}
	*/
}

interface Flying{
	String fly();
}

class Goose extends Animal implements Flying{
	
String animalName = "Goose";
	
	String speak()
	{
		String s = "This " + animalName + " speaks";
		System.out.println(s);
		return s;
	}
	
	String move()
	{
		String m;
		m = "This " + animalName + " moves";
		System.out.println(m);
		return m;
	}
	
	public String fly()
	{
		String f;
		f ="This Goose flies";
		System.out.println(f);
		return f;
	}
	
}


class Tiger extends Animal{
	
String animalName = "Tiger";
	
	String speak()
	{
		String s;
		s = "This " + animalName + " speaks";
		System.out.println(s);
		return s;
	}
	
	String move()
	{
		String m; 
		 m = "This " + animalName + " moves";
		 System.out.println(m);
		 return m;
	}
	
}

class Airplane implements Flying
{
	public String fly()
	{
		String f; 
		f = "This Airplane flies";
		System.out.println(f);
		return f;
	}
}