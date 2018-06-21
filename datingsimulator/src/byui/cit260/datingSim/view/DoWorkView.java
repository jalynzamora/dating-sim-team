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
public class DoWorkView extends View {

    public DoWorkView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];
        String money = this.getInput("Enter money earned:");
        inputs[0] = money;
       
        String bonus = this.getInput("Enter bonus earned:");
        inputs[1] = bonus;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
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
