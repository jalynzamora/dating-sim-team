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
        private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.move();
                break;
            case "C":
                this.initiateConversation();
                break;
            case "D":
                this.date();
                break;
            case "E":
                this.earnMoney();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invaild help menu item.");
        }
        return false;

    }
