/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.control.InventoryControl;
import byui.cit260.model.Game;
import byui.cit260.model.Location;
import byui.cit260.model.Map;
import datingsimulator.Datingsimulator;
import java.util.Scanner;

/**
 *
 * @author noahadams
 */
public class GameMenuView extends View {

    public GameMenuView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String game = this.getInput("M - Map\n" + "O - Move Actor\n" + "T - Socialize\n" + "A - Ask out on date\n"
                + "R - View relationship status\n" + "I - View inventory\n" + "P - Shop\n" + "W - Work\n" + "C - Calculate Interest\n"
                + "X - Calculate Cost of a Date\n" + "D - Dates Locations\n" + "S - Save\n" + "Q - Go back to main menu");
        inputs[0] = game;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "M":
                this.displayMap();
                break;
            case "O":
                this.openMoveActor();
                break;
            case "T":
                this.openSocialize();
                break;
            case "A":
                this.openDate();
                break;
            case "R":
                this.viewStatus();
            case "I":
                this.viewInventory();
                break;
            case "P":
                this.openShop();
                break;
            case "W":
                this.openWork();
                break;
            case "C":
                this.openInterest();
                break;
            case "D":
                this.openDateLocation();
                break;
            case "X":
                this.openDate();
                break;
            case "S":
                this.saveGame();
                break;
            case "Q":
                return true;
            default:
                this.console.println("Invaild menu item.");
        }
        return false;
    }

    private void openSocialize() {
    
    }

    private void viewStatus() {

    }

    private void openDate() {
        CalcDateView calcDateView = new CalcDateView();
        calcDateView.display();
    }

    private void viewInventory() {

    }

    private void openWork() {
        this.console.println("**************************");
        this.console.println("Welcome to walmart, let's start working!\n"
                + "Enter data to calculate the total money earned.");
        this.console.println("**************************");

        DoWorkView doWorkView = new DoWorkView();
        doWorkView.display();
    }

    private void openInterest() {
        CalcInterestView calcInterestView = new CalcInterestView();
        calcInterestView.display();
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }

    private void openDateLocation() {
        this.console.println("**************************\n" + "Let's shop\n" + "**************************");
        DateMenuView dateMenuView = new DateMenuView();
        dateMenuView.display();
    }

    private void openShop() {
        ShopView shopView = new ShopView();
        shopView.display();
    }

    private void displayMap() {
        Game game = Datingsimulator.getCurrentGame();
        Location[][] locations = game.getMap().getLocations();
        this.console.println("Map of Rexburg");
        this.console.println("  1  2  3  4  5");

        for (int row = 0; row < locations.length; row++) {
            this.console.print("-----------------\n");
            this.console.print(row+1 + "|");
            for (int column = 0; column < locations.length; column++) {
                Location location = locations[row][column];
                if(game.getPlayer().getActor().getCoordinates().y == row && game.getPlayer().getActor().getCoordinates().x == column){
                    this.console.print("**");
                }    
                else if (location.isVisited()) {
                    this.console.print(location.getDisplaySymbol());
                
                }else{
                    this.console.print("??");
                }
                this.console.print("|");
            }
            this.console.print("\n");
            
        }
        this.console.print("-----------------\n");
    }

    private void openMoveActor() {
        this.console.println("Move your actor");
        MoveActorView moveActorView = new MoveActorView();
        moveActorView.display();
    }
}
