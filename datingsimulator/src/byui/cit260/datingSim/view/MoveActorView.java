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
        this.console.println("To move an actor, enter coordinates to where you want to go within the map.");

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
            intColumn = Integer.parseInt(column) - 1;
        } catch (NumberFormatException nfe) {
            this.console.println(nfe.getMessage() + "You must enter a number for the row and column.");
            return false;
        }

        Player player = Datingsimulator.getPlayer();
        Actor actor = player.getActor();
        Location newLocation;
        try {
            newLocation = MapControl.moveActor(actor, intRow, intColumn);
        } catch (MapControlException mce)
            {
                this.console.println("Error passed with the exception.");
                return false;
            }

            this.console.println(newLocation.getDescription());
            return true;
        }
    }