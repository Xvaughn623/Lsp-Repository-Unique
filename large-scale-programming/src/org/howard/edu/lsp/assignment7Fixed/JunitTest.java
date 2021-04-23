package org.howard.edu.lsp.assignment7Fixed;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class JunitTest
{
	
	
	@Test
	@DisplayName("Calculates the total of a nissan truck")
		public void testCalculateTotal()
		{
		truck n1 = new NissanTruck(5, 20);
		// 5 tons, 20 axles
		//Toll price = 5(2)* 10 + 20*5 = $200
		//FordTruck f1 = new FordTruck(3, 10);
		
		OmahaTollBooth o1 = new OmahaTollBooth();
		
		Receipt r1 = new Receipt(0,0);
		
		Receipt r2 = new Receipt(0,0);
		r2 = o1.calculateToll(n1, r2);
		
		assertEquals(r1, r2);
		}
	
}