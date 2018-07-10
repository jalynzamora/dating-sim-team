/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.control.GameControl;
import byui.cit260.control.MapControl;
import byui.cit260.exception.MapControlException;
import datingsimulator.Datingsimulator;
import java.util.Scanner;

/**
 *
 * @author noahadams
 */
public class MainMenuView extends View {

    public MainMenuView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String menu = this.getInput("N - New game\n" + "R - Restart game\n" + "H - Get help\n" + "Q - Quit");
        inputs[0] = menu;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "N":
                try {

                    this.startNewGame();
                } catch (MapControlException me) {
                    System.out.println(me.getMessage());
                    return false;
                }
                break;
            case "R":
                this.restartGame();
                break;
            case "H":
                this.getHelp();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invaild menu item.");
        }
        return false;
    }

    private void startNewGame() throws MapControlException {

        GameControl.createNewGame(Datingsimulator.getPlayer());

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();

    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }
}
