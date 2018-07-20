/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.control.GameControl;
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
           this.console.println("Could not create the player." + "Enter a different name");
           return false;
       }
       this.console.println("==================================");
       this.console.println("Welcome to the game " + playerName );
       this.console.println("We hope you have a lot of fun!");
       this.console.println("===================================");
       
       MainMenuView mainMenuView = new MainMenuView();
       mainMenuView.display();
        return true;
    }        

    
    
}

