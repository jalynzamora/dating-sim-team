/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.model.Player;
import java.util.Scanner;

/**
 *
 * @author noahadams
 */
public class StartProgramView {
    public StartProgramView() {
    }

    public void displayStartProgramView() {
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
        System.out.println("Enter player's name below:");
        boolean valid = false;
        while (valid == false) {
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
       String playerName = inputs[0];
       Player player = GameControl.savePlayer(playerName);
       if (player == null){
           System.out.println("Could not create the player." + "Enter a different name");
           return false;
       }
       System.out.println("==================================");
       System.out.println("Welcome to the game " + playerName );
       System.out.println("We hope you have a lot of fun!");
       System.out.println("===================================");
       
       MainMenuView mainMenuView = new MainMenuView();
       mainMenuView.displayMainMenuView();
        return true;
    }        

}

