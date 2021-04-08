package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
//import IntegerSet.Java;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import org.howard.edu.lsp.assignment4.IntegerSetException;
import org.howard.edu.lsp.assignment6.IntegerSet;
import org.junit.jupiter.api.DisplayName;

class IntegerSetTest {

	 @Test
	 @DisplayName("Test cases for add")
	 public void testAdd() 
	 {
	   IntegerSet test = new IntegerSet();
	   
	   test.add(1);
	   
   	assertEquals("[1]", test.toString());


	 }
	 
	 @Test
	 @DisplayName("Test case for contains the number 7")
	 public void testContains() 
	 {
	   IntegerSet test = new IntegerSet();
	   boolean contains;
	   
	   test.add(1);
	   test.add(5);
	   test.add(7);
	   test.add(9);
	   test.add(2);
	   
	   
	   contains = test.contains(7);
	   
	   assertEquals(true, contains);


	 }
	 //Junit case checks if the Integer Set contains the number 7
	    	
    @Test
    @DisplayName("Test cases for equals")
    public void testEquals() {
    	
    	boolean isEqual;
    	
    	IntegerSet test = new IntegerSet();
    	//Checks the equal function
    	test.add(9);
    	test.add(10);
    	test.add(11);
    	test.add(12);
    	//System.out.println("Set 5: " + testSet5.toString());
    	
    	IntegerSet test2 = new IntegerSet();
    	test2.add(9);
    	test2.add(10);
    	test2.add(11);
    	test2.add(12);
    	//System.out.println("Set 6: " + testSet6.toString());
    	
    	//Should be same as they are the exact same
    	isEqual = test.equals(test2);
    	
    	assertEquals(true, isEqual);
    	
    	IntegerSet test3 = new IntegerSet();
    	test3.add(10);
    	test3.add(9);
    	test3.add(12);
    	test3.add(11);
    	//System.out.println("Set 7: " + testSet7.toString());
    	
    	//Should be same even though they are out of order
    	isEqual = test.equals(test3);
    	
    	assertEquals(true, isEqual);
    	
    	IntegerSet test4 = new IntegerSet();
    	test4.add(9);
    	test4.add(10);
    	test4.add(11);
    	test4.add(12);
    	test4.add(13);
    	//System.out.println("Set 8: " + testSet8.toString());
    	//Should be different as a new number is introduced.
    	isEqual = test3.equals(test4);
    	
    	assertEquals(false, isEqual);	
    }
 // Junit test case for testing equals method
    
    @Test
    @DisplayName("Test cases for toString")
    public void testtoString() {
    String actualString;
    // The expected String
    
    IntegerSet test = new IntegerSet();
	test.add(1);
	test.add(2);
	test.add(3);
	//Checks to see if the numbers were properly added, as well as if the toString method works
	actualString = test.toString();
	
	assertEquals("[1, 2, 3]", actualString);
	}
 // Junit test case for testing toString method
    
    @Test
    @DisplayName("Test cases for remove")
    public void testRemove() {
    String actualString;
    IntegerSet test = new IntegerSet();
   	test.add(1);
   	test.add(2);
   	test.add(3);
   	test.add(4);
   	
    test.remove(4);
    
    actualString = test.toString();
    
    assertEquals("[1, 2, 3]", actualString);
    
    }
 // Junit test case for testing remove method
    
    @Test
    @DisplayName("Test cases for clear")
    public void testClear() {
    String actualString;
    IntegerSet test = new IntegerSet();
    
   	test.add(1);
   	test.add(2);
   	test.add(3);
   	
    test.clear();
    
    actualString = test.toString();
    
    assertEquals("[]", actualString);
    
    }
 // Junit test case for testing the clear method
    
    @Test
    @DisplayName("Test cases for largest")
    public void testLargest() throws IntegerSetException {
    int largestNum;
    IntegerSet test = new IntegerSet();
   	test.add(1);
   	test.add(2);
   	test.add(3);
   	test.add(4);
   	
    largestNum = test.largest();
    
    
    assertEquals(4, largestNum);
    
    }
 // Junit test case for testing the largest value in a set
    
    /*
    @Test
    @DisplayName("Test cases for largest value exception")
    public void testLargestException() throws IntegerSetException {
    int largestNum;
    IntegerSet test = new IntegerSet();
   	test.add(1);
   	test.add(2);
   	test.add(3);
   	test.add(4);
   	
   	test.clear();
    largestNum = test.largest();
    
    
    assertThrows(string , largestNum);
    
    }
    */
 // Junit test case for testing the exception in the largest value class
    
    @Test
    @DisplayName("Test cases for smallest value")
    public void testSmallest() throws IntegerSetException {
    int smallestNum;
    IntegerSet test = new IntegerSet();
   	test.add(1);
   	test.add(2);
   	test.add(3);
   	test.add(4);
   	
   	
    smallestNum = test.smallest();
    
    
    assertEquals(1,smallestNum);
    }
 // Junit test case for testing smallest int in a set
    
    @Test
    @DisplayName("Test case for isEmpty class, not empty")
    public void testIsEmpty() throws IntegerSetException {
    boolean testContains;
    IntegerSet test = new IntegerSet();
   	test.add(1);
   	test.add(2);
   	test.add(3);
   	test.add(4);
   	
   	
    testContains = test.isEmpty();
    
    
    assertEquals(false ,testContains);
    }
 // Junit test case for testing a non empty Integer Set

    @Test
    @DisplayName("Test case for isEmpty class, empty")
    public void testIsEmpty2() throws IntegerSetException {
    boolean testContains;
    IntegerSet test = new IntegerSet();
   	
   	
    testContains = test.isEmpty();
    
    
    assertEquals(true ,testContains);
    }
    // Junit test case for testing an empty integerset

    @Test
    @DisplayName("Test case for length")
    public void testLength() throws IntegerSetException {
    int length;
    
    IntegerSet test = new IntegerSet();
   	test.add(1);
   	test.add(2);
   	test.add(3);
   	test.add(4);
   	test.add(5);
   	
   	
    length = test.length();
    
    
    assertEquals(5,length);
    }
    
    /*
    @Test
    @DisplayName("Test case for Union")
    public void testUnion() throws IntegerSetException {
    String union;
    
    IntegerSet test = new IntegerSet();
   	test.add(1);
   	test.add(2);
   	test.add(3);
   	
   	IntegerSet test2 = new IntegerSet();
   	test2.add(3);
   	test2.add(5);
   	
   
   	test.union(test2);
    
   //System.out.println(test.union(test2));
    assertEquals("[3]", );
    */
    
    /*
    @Test
    @DisplayName("Test case for difference")
    public void testDiff() throws IntegerSetException {
    String union;
    
    IntegerSet test = new IntegerSet();
   	test.add(1);
   	test.add(2);
   	
   	IntegerSet test2 = new IntegerSet();
   	test2.add(2);
   	test2.add(3);
   	
   
   	test.diff(test2);
    
   //System.out.println(test.union(test2));
    //assertEquals("[1, 3]");
    }
    */
    //Junit test for difference
    
    /*
    @Test
    @DisplayName("Test case for intersection")
    public void testIntersect() throws IntegerSetException {
    String intersect;
    
    IntegerSet test = new IntegerSet();
   	test.add(1);
   	test.add(2);
   	test.add(3);
   	
   	IntegerSet test2 = new IntegerSet();
   	test2.add(3);
   	test2.add(5);
   	
   
   	test.intersect(test2);
    
    assertEquals("[3]", ;
    } 
    */
    // Junit test case for intersection
    }




