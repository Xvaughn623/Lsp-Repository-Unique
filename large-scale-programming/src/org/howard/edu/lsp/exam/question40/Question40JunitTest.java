package org.howard.edu.lsp.exam.question40;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Question40JunitTest{
	/*
@Test
@DisplayName("Test Case for animal constructor")
public void testAnimalConstruct()
{
	 Animal A = new Animal();
	
}
*/
	//If uncommented, produces an Error since Animal cannot be instantiated. 
	
@Test
@DisplayName("Test Case for goose speaks")
public void testGooseSpeak()
{
	 Animal G = new Goose();
	 assertEquals("This Goose speaks", G.speak());
		
}
//checks to see if Goose can Speak



@Test
@DisplayName("Test Case for Tiger speaks")
public void testAnimalSpeak()
{
	 Animal T = new Tiger();
	 assertEquals("This Tiger speaks", T.speak());
		
}
//checks to see if Tiger can speak



@Test
@DisplayName("Test Case for goose moves")
public void testGooseMoves()
{
	 Animal G = new Goose();
	 assertEquals("This Goose moves", G.move());
	
}
//checks to see if Goose can move


@Test
@DisplayName("Test Case for Tiger moves")
public void testTigerMoves()
{
	 Animal T = new Tiger();
	 assertEquals("This Tiger moves", T.move());
		
}
//checks to see if Tiger can move

@Test
@DisplayName("Test Case for Goose flies")
public void testGooseFlies()
{
	 Flying G = new Goose();
	 assertEquals("This Goose flies", G.fly());
	
}
//checks to see if Goose can be stored in type flying and can fly

@Test
@DisplayName("Test Case for Airplane flies")
public void testAirplaneFlies()
{
	 Flying A = new Airplane();
	 assertEquals("This Airplane flies", A.fly());
	
}
//checks to see if airplane can be stored in type flying and can fly
}
