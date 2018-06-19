/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datingsimulator;

import byui.cit260.datingSim.view.StartProgramView;
import byui.cit260.model.Game;
import byui.cit260.model.Player;

/**
 *
 * @author jalynzamora
 */
public class Datingsimulator {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Datingsimulator.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Datingsimulator.player = player;
    }

}
