/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jalynzamora
 */
public class InterestControlTest {
    
    public InterestControlTest() {
    }

    /**
     * Test of calcInterest method, of class InterestControl.
     */
    @Test
    public void testCalcInterest() {
        System.out.println("calcInterest");
        
        System.out.println("\tTest case 1");
        
        double borrowed = 30000;
        double interestRate = 0.08;
        double years = 5;
        double expResult = 12000.0000;
        double result = InterestControl.calcInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0);
        
        
        
        System.out.println("\tTest case 2");
         borrowed = 1000;
         interestRate = 0.08;
         years = 7;
         expResult = -1;
         result = InterestControl.calcInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0);

        
        
        System.out.println("\tTest case 3");
         borrowed = 40000;
         interestRate = 0.08;
         years = 7;
         expResult = -1;
         result = InterestControl.calcInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0);
        
        
        
        System.out.println("\tTest case 4");
         borrowed = 15000;
         interestRate = 0.01;
         years = 7;
         expResult = -2;
         result = InterestControl.calcInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0);

        
        
         System.out.println("\tTest case 5");
         borrowed = 15000;
         interestRate = 0.11;
         years = 7;
         expResult = -2;
         result = InterestControl.calcInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0);

        
        
         System.out.println("\tTest case 6");
         borrowed = 15000;
         interestRate = 0.08;
         years = 2;
         expResult = -3;
         result = InterestControl.calcInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0);

        
        
         System.out.println("\tTest case 7");
         borrowed = 15000;
         interestRate = 0.08;
         years = 11;
         expResult = -3;
         result = InterestControl.calcInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0);

        
        
        System.out.println("\tTest case 8");
         borrowed = 2000;
         interestRate = 0.03;
         years = 3;
         expResult = 180;
         result = InterestControl.calcInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0);
        
        
        
        System.out.println("\tTest case 9");
         borrowed = 30000;
         interestRate = 0.10;
         years = 10;
         expResult = 30000;
         result = InterestControl.calcInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0);
    }
    
    
    
}
