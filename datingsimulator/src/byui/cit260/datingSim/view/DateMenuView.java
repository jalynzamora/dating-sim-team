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
public class DateMenuView {
    public void displayDateMenuView() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].length() < 1 || inputs[0].equals("Q")) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("A - AppleBees $30");
        System.out.println("C - CupBop Korean BBQ $20");
        System.out.println("F - Freddy's Steak Burgers $20");
        System.out.println("T - Taco Bell $10");
        System.out.println("M - McDonald's $15");
        System.out.println("D - Domino's $15");
        System.out.println("Q - Quit");

        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter the selected menu item.");
            Scanner inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();

            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            valid = true;
        }
        return inputs;
}

    private boolean doAction(String[] inputs) {
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
                System.out.println("Invaild help menu item.");
        }
        return false;

    }

    private void appleBees() {
        System.out.println("You just went on a date to AppleBee's, it cost $30.");
    }

    private void cupBop() {
        System.out.println("You just went on a date to CupBop Korean BBQ, it cost $20.");
    }

    private void Freddys() {
        System.out.println("You just went on a date to Freddy's Steak Burgers, it cost $20.");
    }

    private void tacoBell() {
        System.out.println("You just went on a date to Taco Bell, it cost $10.");
    }

    private void mcDonalds() {
        System.out.println("You just went on a date to McDonald's, it cost $15.");
    }

    private void dominos() {
        System.out.println("You just went on a date to Domino's Pizza, it cost $15.");
    }
}
