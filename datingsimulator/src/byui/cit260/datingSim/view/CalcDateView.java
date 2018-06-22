/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.control.CostDateControl;


/**
 *
 * @author noahadams
 */
public class CalcDateView extends View {

    public CalcDateView() {
    }
   
    @Override
    public String[] getInputs() {
        String[] inputs = new String[3];
        String yourFood = this.getInput("Enter the cost of your food: ");
        inputs[0] = yourFood;
        
        String theirFood = this.getInput("Enter the cost of their food: ");
        inputs[1] = theirFood;
        
        String tip = this.getInput("Enter the amount you tipped: ");
        inputs[2] = tip;
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        double yourFood = Double.parseDouble(inputs[0]);
        double theirFood = Double.parseDouble(inputs[1]);
        double tip = Double.parseDouble(inputs[2]);
        
        double costDate = CostDateControl.costDate(yourFood, theirFood, tip);
        
        System.out.println("The cost of the date is: " + costDate);
        return true;
}
}

