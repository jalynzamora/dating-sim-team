/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import byui.cit260.exception.WorkControlException;

/**
 *
 * @author jalynzamora
 */
public class WorkControl {

    public static double calcTotalMoney(double moneyEarned, double bonus) throws WorkControlException{
        if (moneyEarned < 50 || moneyEarned > 300) {
            throw new WorkControlException("Money Earned must be between 50 to 300."); 
        }
        if (bonus < 0.03 || bonus > 0.06) {
            throw new WorkControlException("Bonus must be between 0.03 to 0.06");
        }
        double totalMoney = (moneyEarned+bonus)-0.18*(moneyEarned+bonus);

return totalMoney;
    }
}
