/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.model.Actor;
import byui.cit260.model.Game;
import byui.cit260.model.Player;
import datingsimulator.Datingsimulator;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jalynzamora
 */
public class ReportListOfActorsView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("To print the list of Actors, a name needs to be create \n"
                + "for the file you will be saving it to.");
        String fileName = this.getInput("Please enter the file name below:");
        inputs[0] = fileName;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        try (PrintWriter out = new PrintWriter(filePath)) {
            this.console.println("The list of Actors were printed out to: " + filePath);
            Game game = Datingsimulator.getCurrentGame();
            Player player = game.getPlayer();
            Actor actors = player.getActor();
            out.println("\n\n             List of Actors Report           ");
            out.println("%-12s %-25s", "Name", "Location");
            
            for (Actor actor: actors) {
                out.println(String.format(actors.getName(), actors.getCoordinates());
            }

        } catch (IOException ie) {
            ErrorView.display(this.getClass().getName(), ie.getMessage());
            return false;
        }

        return true;
    }

}
