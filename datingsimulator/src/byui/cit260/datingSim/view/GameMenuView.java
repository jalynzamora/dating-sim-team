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
class GameMenuView {

    public GameMenuView() {
    }

    public void displayGameMenuView() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();

            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("**************************");
        System.out.println("M - Map\n" + "T - Socialize\n" + "A - Ask out on date\n"
                + "R - View relationship status\n" + "I - View inventory\n" + "W - Work\n" +"C - Calculate Interest\n" + "S - Save\n" + "Q - Go back to main menu");
        System.out.println("**************************");
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
            case "M":
                this.openMap();
                break;
            case "T":
                this.openSocialize();
                break;
            case "A":
                this.openDate();
                break;
            case "R":
                this.viewStatus();
            case "I":
                this.viewInventory();
                break;
            case "W":
                this.openWork();
                break;
            case "C":
                this.openInterest();
                break;
            case "S":
                this.saveGame();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invaild menu item.");
        }
        return false;
    }

    private void openMap() {

    }

    private void openSocialize() {

    }

    private void viewStatus() {

    }

    private void openDate() {

    }

    private void viewInventory() {

    }

    private void openWork() {
        System.out.println("**************************");
        System.out.println("Welcome to walmart, let's start working!\n"
                + "Enter data to calculate the total money earned.");
        System.out.println("**************************");
        
        DoWorkView doWorkView = new DoWorkView();
        doWorkView.displayDoWorkView();
    }
    
    private void openInterest() {
    CalcInterestView calcInterestView = new CalcInterestView();
    calcInterestView.displayCalcInterestView();
}

    private void saveGame() {

    }

}
