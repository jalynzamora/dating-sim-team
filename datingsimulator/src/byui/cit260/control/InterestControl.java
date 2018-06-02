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
public class InterestControl {

    public static double calcInterest(double borrowed, double interestRate, double years) {
        if (borrowed < 2000 || borrowed > 30000) {
            return -1;
        }
        if (interestRate < 0.03 || interestRate > 0.1) {
            return -2;
        }
        if (years < 3 || years > 10) {
            return -3;
        }
        
        double interest = (borrowed * interestRate) * years;
        
        
        return interest;

    }
}
