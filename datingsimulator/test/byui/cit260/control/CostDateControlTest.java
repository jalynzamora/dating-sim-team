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
 * @author noahadams
 */
public class CostDateControlTest {

    public CostDateControlTest() {
    }

    /**
     * Test of costDate method, of class CostDateControl.
     */
    @Test
    public void testCostDate() {

        System.out.println("Test 1");
        double yourFood = 15;
        double theirFood = 15;
        double tipPercent = 0.15;
        double expResult = 34.50000;
        double result = CostDateControl.costDate(yourFood, theirFood, tipPercent);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("Test 2");
        yourFood = 5;
        theirFood = 15;
        tipPercent = 0.15;
        expResult = -1;
        result = CostDateControl.costDate(yourFood, theirFood, tipPercent);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("Test 3");
        yourFood = 30;
        theirFood = 15;
        tipPercent = 0.15;
        expResult = -1;
        result = CostDateControl.costDate(yourFood, theirFood, tipPercent);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("Test 4");
        yourFood = 15;
        theirFood = 5;
        tipPercent = 0.15;
        expResult = -2;
        result = CostDateControl.costDate(yourFood, theirFood, tipPercent);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("Test 5");
        yourFood = 15;
        theirFood = 30;
        tipPercent = 0.15;
        expResult = -2;
        result = CostDateControl.costDate(yourFood, theirFood, tipPercent);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("Test 6");
        yourFood = 15;
        theirFood = 15;
        tipPercent = 0.05;
        expResult = -3;
        result = CostDateControl.costDate(yourFood, theirFood, tipPercent);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("Test 7");
        yourFood = 15;
        theirFood = 15;
        tipPercent = 0.25;
        expResult = -3;
        result = CostDateControl.costDate(yourFood, theirFood, tipPercent);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("Test 8");
        yourFood = 10;
        theirFood = 10;
        tipPercent = 0.1;
        expResult = 22;
        result = CostDateControl.costDate(yourFood, theirFood, tipPercent);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("Test 9");
        yourFood = 25;
        theirFood = 25;
        tipPercent = 0.2;
        expResult = 60;
        result = CostDateControl.costDate(yourFood, theirFood, tipPercent);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
}
