/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.control.GameControl;
import byui.cit260.exception.GameControlException;
import byui.cit260.model.Game;
import datingsimulator.Datingsimulator;

/**
 *
 * @author jalynzamora
 */
public class SaveGameView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("To save the game, enter a valid file name");
        String input1 = this.getInput("\nPlease enter the Menu Option");
        inputs[0] = input1;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
    String filePath = inputs[0];
    
    Game game = Datingsimulator.getCurrentGame();
    
    try {
        GameControl.saveGame(game, filePath);        
    }catch (GameControlException ie){
        ErrorView.display(this.getClass().getName(), ie.getMessage());
        return false;
    }
    this.console.println("The game was saved successfully to" + filePath);
    return true;
    }
}
