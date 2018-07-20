/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.control.WorkControl;
import byui.cit260.exception.WorkControlException;
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
        
        double money = 0;
        double bonus = 0;
        double total;
        
        try{
        money = Double.parseDouble(inputs[0]);
        bonus = Double.parseDouble(inputs[1]);
        } catch(NumberFormatException nfe){
            this.console.println(nfe.getMessage());
        }
        
        try{
            total = WorkControl.calcTotalMoney(money, bonus);
        } catch(WorkControlException ie){
            this.console.println(ie.getMessage());
            return false;
        }

        if (money == -1) {
            this.console.println("Invaild money. Could not calculate the total. Try again");
            return false;
        }
        if (bonus == -2) {
            this.console.println("Invaild bonus. Could not calculate the total. Try again");
            return false;
        }
        this.console.println("The total money earned is " + total);
        return true;
    }
}
