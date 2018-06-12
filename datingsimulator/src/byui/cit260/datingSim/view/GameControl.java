/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.model.Player;
import datingsimulator.Datingsimulator;

/**
 *
 * @author noahadams
 */
class GameControl {

    static Player savePlayer(String playerName) {
        if (playerName == null || playerName.length() < 1) {
            return null;
        }
        Player player = new Player();
        player.setName(playerName);
        Datingsimulator.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("createNewGame was called");
    }
}
