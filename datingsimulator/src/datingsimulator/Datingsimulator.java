/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datingsimulator;

import byui.cit260.model.Player;

/**
 *
 * @author jalynzamora
 */
public class Datingsimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Player playerOne = new Player();
    
    playerOne.setName("Jesus");
    
    String playerOneName = playerOne.getName();
    
    System.out.println("Name = " + playerOneName);
            }
}
