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
        double expResult = 41505.0000;
        double result = InterestControl.calcInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0);
    }
    
}
