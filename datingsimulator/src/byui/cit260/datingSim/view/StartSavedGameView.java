/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.control.GameControl;
import byui.cit260.exception.GameControlException;

/**
 *
 * @author jalynzamora
 */
public class StartSavedGameView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("Enter the name of the saved game\n");
        String input = this.getInput("enter below:");
        inputs[0] = input;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        try {
            GameControl.getGame(filePath);
        } catch(GameControlException ie) {
            ErrorView.display(this.getClass().getName(), ie.getMessage());
            return false;
        }
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        return true;
    }
}
