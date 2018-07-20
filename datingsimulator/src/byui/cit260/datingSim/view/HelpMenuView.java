/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import java.util.Scanner;

/**
 *
 * @author noahadams
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
    }

    
@Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String help = this.getInput("G - What is the goal of the game?\n" + "M - How to Move?\n" + "C - How to initiate conversation with someone?\n" 
       + "D - How to go on a date?\n" + "E - How to earn money?\n" + "Q - Quit");
        inputs[0] = help;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.move();
                break;
            case "C":
                this.initiateConversation();
                break;
            case "D":
                this.date();
                break;
            case "E":
                this.earnMoney();
                break;
            case "Q":
                return true;
            default:
                this.console.println("Invaild help menu item.");
        }
        return false;

    }

    private void goalOfGame() {
        this.console.println("Date people and try to get engaged by the end of the game.");
    }

    private void move() {
        this.console.println("Enter coordinates.");
    }

    private void initiateConversation() {
        this.console.println("You need a specific item to talk to people in different areas.");
    }

    private void date() {
        this.console.println("Find a date and take them to a date location.");
    }

    private void earnMoney() {
        this.console.println("Answer questions during work to earn money.");
    }
}
