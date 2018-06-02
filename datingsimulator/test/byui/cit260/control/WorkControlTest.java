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
public class WorkControlTest {

    public WorkControlTest() {
    }


    /* Test of calcTotalMoney method, of class WorkControl.
     */
    @Test
    public void testCalcTotalMoney() {
        System.out.println("calcTotalMoney");
        
        System.out.println("\tTest case 1");
        
        long moneyEarned = 100;
        double bonus = 0.04;
        double expResult = 82.0328;
        double result = WorkControl.calcTotalMoney(moneyEarned, bonus);
        assertEquals(expResult, result, 0.0);
    }

}
