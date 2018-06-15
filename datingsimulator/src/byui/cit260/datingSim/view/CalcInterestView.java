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
class CalcInterestView {

    public CalcInterestView() {
    }

    public void displayCalcInterestView() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();

            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[3];
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter the amount of money you borrowed");
            Scanner inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();

            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            valid = true;
        }
        valid = false;
        while (valid == false) {
            System.out.println("Enter the interest rate");
            Scanner inFile = new Scanner(System.in);
            inputs[1] = inFile.nextLine();

            if (inputs[1].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            valid = true;
        }
        valid = false;
        while (valid == false) {
            System.out.println("Enter years");
            Scanner inFile = new Scanner(System.in);
            inputs[2] = inFile.nextLine();

            if (inputs[1].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        double principal = Double.parseDouble(inputs[0]);
        double rate = Double.parseDouble(inputs[1]);
        double years = Double.parseDouble(inputs[2]);
        double interest = InterestControl.calcInterest(principal, rate, years);

        if (principal == -1) {
            System.out.println("Invaild amount borrowed. Please enter a valid value. Try again");
            return false;
        }
        if (rate == -2) {
            System.out.println("Invaild interest rate. Please enter a valid value. Try again");
            return false;
        }
        if (years == -3) {
            System.out.println("Invaild amount of years. Please enter a valid value. Try again");
            return false;
        }
        System.out.println("The interest is $" + interest);
        return true;
    }
}
