/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import byui.cit260.exception.MapControlException;
import byui.cit260.model.Actor;
import byui.cit260.model.Game;
import byui.cit260.model.InventoryItem;
import byui.cit260.model.Location;
import byui.cit260.model.Map;
import byui.cit260.model.Question;
import byui.cit260.model.QuestionLocation;
import byui.cit260.model.QuestionType;
import datingsimulator.Datingsimulator;
import static datingsimulator.Datingsimulator.getCurrentGame;
import java.awt.Point;

/**
 *
 * @author jalynzamora
 */
public class MapControl {

    public static Map createMap(Game game, int noOfRows, int noOfColumns) throws MapControlException {

        if (game == null || noOfRows < 0 || noOfColumns < 0) {
            throw new MapControlException("The coordinates you enter must be valid.");
        }

        Map map = new Map();

        map.setDescription("this is the map");
        map.setColumnCount(5);
        map.setRowCount(5);
        map.setCurrentColumn(0);
        map.setCurrentRow(0);

        game.setMap(map);

        Location[][] locations = createLocations(noOfRows, noOfColumns);
        if (locations == null) {
            throw new MapControlException("Enter a valid location.");
        }
        map.setLocations(locations);

        assignActorsToLocations(locations);
        assignQuestionsToLocations(locations, game.getQuestions());

        return map;
    }

    public static Location[][] createLocations(int noOfRows, int noOfColumns) {
        Location[][] locations = new Location[noOfRows][noOfColumns];

        locations[0][0] = new Location(0, 0, "..", "an empty street", false);
        locations[1][0] = new Location(1, 0, "..", "a reealllly empty street", false);
        locations[2][0] = new Location(2, 0, "..", "Crime scene, meth lab bust", false);
        locations[3][0] = new Location(3, 0, "..", "Applebees", false);
        locations[4][0] = new Location(4, 0, "..", "an empty street", false);
        locations[0][1] = new Location(0, 1, "..", "an empty street", false);
        locations[1][1] = new Location(1, 1, "..", "McDonalds", false);
        locations[2][1] = new Location(2, 1, "..", "Math Lab", false);
        locations[3][1] = new Location(3, 1, "..", "an empty street", false);
        locations[4][1] = new QuestionLocation(1, 0, 4, 1, "##", "pump iron", true);
        locations[0][2] = new Location(0, 2, "..", "Park", false);
        locations[1][2] = new Location(1, 2, "..", "Freddys", false);
        locations[2][2] = new Location(2, 2, "..", "an empty street", false);
        locations[3][2] = new Location(3, 2, "..", "CupBop", false);
        locations[4][2] = new Location(4, 2, "..", "an empty street", false);
        locations[0][3] = new Location(0, 3, "..", "an empty street", false);
        locations[1][3] = new Location(1, 3, "..", "Sodavine", false);
        locations[2][3] = new Location(2, 3, "..", "Dominos", false);
        locations[3][3] = new Location(3, 3, "..", "an empty street", false);
        locations[4][3] = new Location(4, 3, "..", "an empty street", false);
        locations[0][4] = new Location(0, 4, "..", "TacoBell", false);
        locations[1][4] = new Location(1, 4, "..", "an empty street", false);
        locations[2][4] = new QuestionLocation(1, 0, 2, 4, "$$", "a soul sucking hive of scum and villany", true);
        locations[3][4] = new Location(3, 4, "..", "Walmart", false);
        locations[4][4] = new Location(4, 4, "..", "an empty street", false);

        return locations;
    }

    private static void assignActorsToLocations(Location[][] locations) throws MapControlException {

        if (locations == null) {
            throw new MapControlException("You must enter a valid location.");
        }

        Actor[] actors = Actor.values();

        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            Location location = locations[coordinates.x][coordinates.y];
             location.setActor(actor);
        }

    }
    
    private static void assignQuestionsToLocations(Location[][] locations, Question[] questions){

        QuestionLocation location = (QuestionLocation) locations[4][1];
        location.getQuestion().add(questions[QuestionType.gym.ordinal()]);
    
        location = (QuestionLocation) locations[2][4];
        location.getQuestion().add(questions[QuestionType.work.ordinal()]);
    }

    public static Location moveActor(Actor actor, int newRow, int newColumn) throws MapControlException {
        if (actor == null) {
            throw new MapControlException("you must enter a valid coordinate");
        }
        Game game = Datingsimulator.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();

        if (newRow < 1 || newRow > map.getRowCount()
                || newColumn < 1 || newColumn > map.getColumnCount()) {
            throw new MapControlException("Enter something valid.");
        }

        int currentRow = actor.getCoordinates().y;
        int currentColumn = actor.getCoordinates().x;
        Location oldLocation = locations[currentRow][currentColumn];

        Location newLocation = locations[newRow][newColumn];

        newRow = actor.getCoordinates().y;
        newColumn = actor.getCoordinates().x;

        return newLocation;

    }

}
