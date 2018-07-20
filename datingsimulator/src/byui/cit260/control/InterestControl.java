/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import byui.cit260.exception.InterestControlException;

/**
 *
 * @author jalynzamora
 */
public class InterestControl {

    public static double calcInterest(double borrowed, double interestRate, double years) throws InterestControlException {
        if (borrowed < 2000 || borrowed > 30000) {
            throw new InterestControlException("The amount borrowed must be between 2000 to 30000.");
        }
        if (interestRate < 0.03 || interestRate > 0.1) {
            throw new InterestControlException("The interest rate must be between 0.03 to 0.1.");
        }
        if (years < 3 || years > 10) {
             throw new InterestControlException("The years must be between 3 to 10.");
        }
        
        double interest = (borrowed * interestRate) * years;
        
        
        return interest;

    }
}
