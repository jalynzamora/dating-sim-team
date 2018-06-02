/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

/**
 *
 * @author jalynzamora
 */
public class WorkControl {

    public static double calcTotalMoney(double moneyEarned, double bonus) {
        if (moneyEarned < 50 || moneyEarned > 300) {
            return -1;
        }
        if (bonus < 0.03 || bonus > 0.06) {
            return -2;
        }
        double totalMoney = (moneyEarned+bonus) -0.18*(moneyEarned+bonus);

return totalMoney;
    }
}
