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
public class StartProgramView extends View {
    public StartProgramView() {
    }

    
    
@Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String name = this.getInput("Enter your name:");
        inputs[0] = name;
        
        
        return inputs;
    }
    @Override
    public boolean doAction(String[] inputs) {
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
       mainMenuView.display();
        return true;
    }        

    
    
}

