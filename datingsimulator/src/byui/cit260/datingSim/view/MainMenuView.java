/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import datingsimulator.Datingsimulator;
import java.util.Scanner;

/**
 *
 * @author noahadams
 */
class MainMenuView {

    public void displayMainMenuView() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            
            
            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("N - New game\n" + "R - Restart game\n" + "H - Get help\n" + "Q - Quit\n" + "D - Places and cost of a date");

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
            case "N":
                this.startNewGame();
                break;
            case "R":
                this.restartGame();
                break;
            case "H":
                this.getHelp();
                break;
            case "D":
                this.getDate();
            case "Q":
                return true;
            default:
                System.out.println("Invaild menu item.");
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(Datingsimulator.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();

    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getDate() {
        DateMenuView dateMenuView = new DateMenuView();
        dateMenuView.displayDateMenuView();
    }
}
