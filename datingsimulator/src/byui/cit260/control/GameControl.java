/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import byui.cit260.model.Actor;
import byui.cit260.model.Game;
import byui.cit260.model.InventoryItem;
import byui.cit260.model.InventoryItemType;
import byui.cit260.model.Map;
import byui.cit260.model.Player;
import byui.cit260.model.Question;
import byui.cit260.model.QuestionType;
import datingsimulator.Datingsimulator;

/**
 *
 * @author noahadams
 */
public class GameControl {

    public static Player savePlayer(String playerName) {
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

        Map map = createMap(game, 5, 5);

        if (map == null) {
            return -2;
        }
        game.setMap(map);
        return 1;
    }

    public static InventoryItem[] createItems() {
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

    public static Question[] createQuestions() {
        Question[] questions = new Question[5];

        Question relationship = new Question();
        relationship.setQuestion("How is our relationship doing?");
        relationship.setAnswer("");
        relationship.setRequired(true);
        relationship.setNumPoints(10);
        questions[QuestionType.relationship.ordinal()] = relationship;

        return questions;
    }

    public static Map createMap(Game game, int noOfRows, int noOfColumns) {

        System.out.println("createMap() was called");
        Map map = new Map();

        return map;

    }

}
