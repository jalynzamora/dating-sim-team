/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import byui.cit260.exception.GameControlException;
import byui.cit260.exception.MapControlException;
import byui.cit260.model.Actor;
import byui.cit260.model.Game;
import byui.cit260.model.InventoryItem;
import byui.cit260.model.InventoryItemType;
import byui.cit260.model.Location;
import byui.cit260.model.Map;
import byui.cit260.model.Player;
import byui.cit260.model.Question;
import byui.cit260.model.QuestionType;
import datingsimulator.Datingsimulator;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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

    public static int createNewGame(Player player) throws MapControlException {
        if (player == null) {
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);
        Datingsimulator.setCurrentGame(game);

        player.setActor(Actor.Playerm);

        InventoryItem[] inventoryList = createItems();
        game.setInventory(inventoryList);

        Question[] questions = createQuestions();
        game.setQuestions(questions);

        Map map = MapControl.createMap(game, 5, 5);

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

        Question work = new Question();
        work.setQuestion("How much money did I make today, boss?");
        work.setAnswer("");
        work.setRequired(true);
        work.setNumPoints(10);
        questions[QuestionType.work.ordinal()] = relationship;

        Question gym = new Question();
        gym.setQuestion("Do you even lift?");
        gym.setAnswer("");
        gym.setRequired(false);
        gym.setNumPoints(10);
        questions[QuestionType.gym.ordinal()] = relationship;

        Question proposal = new Question();
        proposal.setQuestion("Sooooo, you're gonna marry me, right?");
        proposal.setAnswer("");
        proposal.setRequired(true);
        proposal.setNumPoints(10);
        questions[QuestionType.proposal.ordinal()] = relationship;

        return questions;
    }

    public static void saveGame(Game game, String filePath) throws GameControlException {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fos);

            output.writeObject(game);
        } catch (Exception ie) {
            throw new GameControlException(ie.getMessage());
        }
    }

    public static Game getGame(String filePath) throws GameControlException {
        if (filePath == null) {
            throw new GameControlException("Invalid file path");
        }
        Game game = null;
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
            Datingsimulator.setCurrentGame(game);
            Datingsimulator.setPlayer(game.getPlayer());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        return game;
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            game = (Game) input.readObject();
        } catch (Exception ie) {
            throw new GameControlException(ie.getMessage());
        }
        Datingsimulator.setCurrentGame(game);
    }

}
