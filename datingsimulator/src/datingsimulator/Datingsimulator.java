/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datingsimulator;

import byui.cit260.model.Actor;
import static byui.cit260.model.Actor.Quavious;
import static byui.cit260.model.Actor.Velma;
import byui.cit260.model.Game;
import byui.cit260.model.InventoryItem;
import byui.cit260.model.Map;
import byui.cit260.model.Player;
import byui.cit260.model.Relationship;

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

        playerOne.setName("Quavious");

        String playerOneName = playerOne.getName();

        System.out.println("Name = " + playerOneName);
   
      
        Game game = new Game();
        game.setTotalDays(5);
        game.setMoney(10);
        game.setPlayer(playerOne);
        
        System.out.println(game.toString());
        
        System.out.println(Actor.Quavious.toString());
        
        
        InventoryItem items = new InventoryItem();
        items.setItemType("frisbee");
        items.setDescription("Used at connect with others at the park.");
        items.setQuantity(4);
        items.setGame(game);
        
        System.out.println(items.toString());
        
        
        Map map = new Map();
        map.setRowCount(2);
        map.setColumnCount(4);
        map.setCurrentRow(3);
        map.setCurrentColumn(1);
        map.setDescription("These are locations on the map");
        
        System.out.println(map.toString());
        
        
        Relationship relationships = new Relationship();
        relationships.setRelationshipStatus(25);
        relationships.setRelationshipStrength(playerOneName);
        relationships.setActor1(Velma);
        relationships.setActor2(Quavious);
        
        System.out.println(relationships.toString());

}
}