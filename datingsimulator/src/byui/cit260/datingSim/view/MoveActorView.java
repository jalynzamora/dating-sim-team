/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.control.MapControl;
import byui.cit260.exception.MapControlException;
import byui.cit260.model.Actor;
import byui.cit260.model.Location;
import byui.cit260.model.Player;
import datingsimulator.Datingsimulator;

/**
 *
 * @author noahadams
 */
public class MoveActorView extends View {



    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];
        System.out.println("To move an actor, enter coordinates to where you want to go within the map.");

        String input1 = this.getInput("Enter row:");
        inputs[0] = input1;

        String input2 = this.getInput("Enter column:");
        inputs[1] = input2;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String row = inputs[0];
        String column = inputs[1];
        int intRow;
        int intColumn;

        try {
            intRow = Integer.parseInt(row) - 1;
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage() + "You must enter a number for the row and column.");
            return false;
        }

        Player player = Datingsimulator.getPlayer();
        Actor actor = Actor.Playerm;

        try {
            Location newLocation = MapControl.moveActor(actor, Integer.parseInt(row), Integer.parseInt(column));
        } catch (MapControlException | NumberFormatException mce)
            {
                System.out.println("Error passed with the exception.");
                return false;
            }

            System.out.println("You just went to Walmart. Get your shopping done!");
            return true;
        }
    }