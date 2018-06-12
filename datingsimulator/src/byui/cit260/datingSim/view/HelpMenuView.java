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
class HelpMenuView {

    public void displayHelpMenuView() {
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
        System.out.println("G - What is the goal of the game?");
        System.out.println("M - How to Move?");
        System.out.println("C - How to initiate conversation with someone?");
        System.out.println("D - How to go on a date?");
        System.out.println("E - How to earn money?");
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

    private void goalOfGame() {
        System.out.println("Date people and try to get engaged by the end of the game.");
    }

    private void move() {
        System.out.println("Enter coordinates.");
    }

    private void initiateConversation() {
        System.out.println("You need a specific item to talk to people in different areas.");
    }

    private void date() {
        System.out.println("Find a date and take them to a date location.");
    }

    private void earnMoney() {
        System.out.println("Answer questions during work to earn money.");
    }
}
