/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import java.util.Scanner;

/**
 *
 * @author noahadams
 */
public class DateMenuView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String menu = this.getInput("A - AppleBees $30\n"+"C - CupBop Korean BBQ $20\n"+"F - Freddy's Steak Burgers $20\n"
                + "T - Taco Bell $10\n" + "M - McDonald's $15\n" + "D - Domino's $15\n" + "Q - Quit");
        inputs[0] = menu;
        return inputs;
}
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "A":
                this.appleBees();
                break;
            case "C":
                this.cupBop();
                break;
            case "F":
                this.Freddys();
                break;
            case "T":
                this.tacoBell();
                break;
            case "M":
                this.mcDonalds();
                break;
            case "D":
                this.dominos();
                break;
            case "Q":
                return true;
            default:
                this.console.println("Invaild help menu item.");
        }
        return false;

    }

    private void appleBees() {
        this.console.println("You just went on a date to AppleBee's, it cost $30.");
    }

    private void cupBop() {
        this.console.println("You just went on a date to CupBop Korean BBQ, it cost $20.");
    }

    private void Freddys() {
        this.console.println("You just went on a date to Freddy's Steak Burgers, it cost $20.");
    }

    private void tacoBell() {
        this.console.println("You just went on a date to Taco Bell, it cost $10.");
    }

    private void mcDonalds() {
        this.console.println("You just went on a date to McDonald's, it cost $15.");
    }

    private void dominos() {
        this.console.println("You just went on a date to Domino's Pizza, it cost $15.");
    }
}
