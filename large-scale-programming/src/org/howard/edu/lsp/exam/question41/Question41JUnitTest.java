package org.howard.edu.lsp.exam.question41;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Question41JUnitTest{
	
@Test
@DisplayName("Test Case for ArrayList with one zero")
	public void testArrayWithAZero()
{
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	ArrayList<Integer> expectedAL = new ArrayList<Integer>();
	
	Question41 q = new Question41();
	
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(0);
	al.add(5);
	q.removeZeroes(al);
	
	expectedAL.add(1);
	expectedAL.add(2);
	expectedAL.add(3);
	expectedAL.add(5);
	
	q.print(al);
	
	assertEquals(expectedAL, q.removeZeroes(al));
}

// Sees if only the zero between the 3 and 5 are deleted

@Test
@DisplayName("Test Case for ArrayList with two zeros")
public void testArrayWithTwoZeros()
{
ArrayList<Integer> al = new ArrayList<Integer>();

ArrayList<Integer> expectedAL = new ArrayList<Integer>();

Question41 q = new Question41();

al.add(1);
al.add(0);
al.add(3);
al.add(0);
al.add(5);
q.removeZeroes(al);

expectedAL.add(1);
expectedAL.add(3);
expectedAL.add(5);

q.print(al);

assertEquals(expectedAL, q.removeZeroes(al));
}

// Sees if the two zeros are deleted

@Test
@DisplayName("Test Case for ArrayList with No zeros")
public void testArrayWithNoZeros()
{
ArrayList<Integer> al = new ArrayList<Integer>();

ArrayList<Integer> expectedAL = new ArrayList<Integer>();

Question41 q = new Question41();

al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);
q.removeZeroes(al);

expectedAL.add(1);
expectedAL.add(2);
expectedAL.add(3);
expectedAL.add(4);
expectedAL.add(5);

q.print(al);

assertEquals(expectedAL, q.removeZeroes(al));
}
// Sees if any numbers are deleted when No zeros are implemented

}