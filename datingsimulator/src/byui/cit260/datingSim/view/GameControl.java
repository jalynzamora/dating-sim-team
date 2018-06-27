/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.model.Actor;
import byui.cit260.model.Game;
import byui.cit260.model.InventoryItem;
import byui.cit260.model.InventoryItemType;
import byui.cit260.model.Player;
import byui.cit260.model.Question;
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

    public static int createNewGame(Player player) {
        if (player == null) {
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);
        Datingsimulator.setCurrentGame(game);

        player.setActor(Actor.Playerm);

        InventoryItem[] inventoryList = createItems();
        
        Question[] questions = createQuestions();

        return 0;
    }

    private static InventoryItem[] createItems() {
       InventoryItem[] items = new InventoryItem[3];
       
       InventoryItem gymClothes = new InventoryItem();
       gymClothes.setQuantity(0);
       gymClothes.setDescription("Clothes used for the gym.");
       gymClothes.setItemType("Clothes");
       items[InventoryItemType.gymClothes.ordinal()] = gymClothes;
       
       InventoryItem calculator = new InventoryItem("calculator", "it is pretty scratched up", 0);
       items[InventoryItemType.calculator.ordinal()] = calculator;
       
       InventoryItem frisbee = new InventoryItem("frisbee", "in great condition", 0);
       items[InventoryItemType.frisbee.ordinal()] = frisbee;
       
       return items;
    }

    private static Question[] createQuestions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
