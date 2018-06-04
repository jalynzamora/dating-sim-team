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
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest case 2");
        moneyEarned = 400;
        bonus = 0.05;
        expResult = -1;
        result = WorkControl.calcTotalMoney(moneyEarned, bonus);
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest case 3");
        moneyEarned = 20;
        bonus = 0.04;
        expResult = -1;
        result = WorkControl.calcTotalMoney(moneyEarned, bonus);
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest case 4");
        moneyEarned = 150;
        bonus = -2;
        expResult = -2;
        result = WorkControl.calcTotalMoney(moneyEarned, bonus);
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest case 5");
        moneyEarned = 80;
        bonus = 0;
        expResult = -2;
        result = WorkControl.calcTotalMoney(moneyEarned, bonus);
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest case 6");
        moneyEarned = 50;
        bonus = 0.03;
        expResult = 41.0246;
        result = WorkControl.calcTotalMoney(moneyEarned, bonus);
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest case 7");
        moneyEarned = 300;
        bonus = 0.06;
        expResult = 246.0492;
        result = WorkControl.calcTotalMoney(moneyEarned, bonus);
        assertEquals(expResult, result, 0.0001);
    }

}
