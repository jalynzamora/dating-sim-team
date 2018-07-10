/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.control.InterestControl;
import static java.lang.Double.parseDouble;
import java.util.Scanner;

/**
 *
 * @author noahadams
 */
public class CalcInterestView extends View{

    public CalcInterestView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[3];
        String money = this.getInput("Enter the amount of money you borrowed");
        inputs[0] = money;

        String rate = this.getInput("Enter the interest rate");
        inputs[1] = rate;

        String year = this.getInput("Enter years");
        inputs[2] = year;
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        double principal = 0;
        double rate = 0;
        double years = 0;
        double interest = 0;
        try { principal = Double.parseDouble(inputs[0]);
       rate = Double.parseDouble(inputs[1]);
       years = Double.parseDouble(inputs[2]);
       interest = InterestControl.calcInterest(principal, rate, years);
        } catch(NumberFormatException nfe) {
            System.out.println("ERROR " + nfe.getMessage());
        }

        if (interest == -1) {
            System.out.println("Invaild amount borrowed. Please enter a valid value. Try again");
            return false;
        }
        if (interest == -2) {
            System.out.println("Invaild interest rate. Please enter a valid value. Try again");
            return false;
        }
        if (interest == -3) {
            System.out.println("Invaild amount of years. Please enter a valid value. Try again");
            return false;
        }
        System.out.println("The interest is $" + interest);
        return true;
    }
}
