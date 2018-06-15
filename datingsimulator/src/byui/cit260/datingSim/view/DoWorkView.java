/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.control.WorkControl;
import java.util.Scanner;

/**
 *
 * @author jalynzamora
 */
class DoWorkView {

    public DoWorkView() {
    }

    public void displayDoWorkView() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();

            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[2];
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter money earned:");
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
            System.out.println("Enter bonus earned:");
            Scanner inFile = new Scanner(System.in);
            inputs[1] = inFile.nextLine();

            if (inputs[1].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        double money = Double.parseDouble(inputs[0]);
        double bonus = Double.parseDouble(inputs[1]);

        double total = WorkControl.calcTotalMoney(money, bonus);

        if (money == -1) {
            System.out.println("Invaild money. Could not calculate the total. Try again");
            return false;
        }
        if (bonus == -2) {
            System.out.println("Invaild bonus. Could not calculate the total. Try again");
            return false;
        }
        System.out.println("The total money earned is " + total);
        return true;
    }
}
