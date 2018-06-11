/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.model.Player;

/**
 *
 * @author noahadams
 */
class GameControl {

    static Player savePlayer(String playerName) {
        System.out.println("**** savePlayer() called ***");
        return new Player();
    }
    
}
