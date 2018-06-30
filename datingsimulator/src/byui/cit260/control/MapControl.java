/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import byui.cit260.model.Actor;
import byui.cit260.model.Game;
import byui.cit260.model.Location;
import byui.cit260.model.Map;

/**
 *
 * @author jalynzamora
 */
public class MapControl {

    public static Map createMap(Game game, int noOfRows, int noOfColumns) {

        if (game == null || noOfRows < 0 || noOfColumns < 0) {
            return null;
        }

        Map map = new Map();

        map.setDescription("this is the map");
        map.setColumnCount(5);
        map.setRowCount(5);
        map.setCurrentColumn(0);
        map.setCurrentRow(0);

        game.setMap(map);
        
        Actor[] actors = assignActorsToLocations();

        Location[][] location = createLocations(noOfRows, noOfColumns);
        if (location == null) {
            return null;
        }

        return map;
    }

    public static Location[][] createLocations(int noOfRows, int noOfColumns) {
        System.out.println("*** createLocations called");
        Location[][] locations = new Location[noOfRows][noOfColumns];
        return locations;
    }

    private static Actor[] assignActorsToLocations() {
        
        Actor[] actors = Actor.values();
        
        for(actors ){
            if()
        }
            
        
    }
    
    
    

}
