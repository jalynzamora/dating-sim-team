/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datingsimulator;

import byui.cit260.model.Actor;
import static byui.cit260.model.Actor.Quavious;
import byui.cit260.model.Game;
import byui.cit260.model.Location;
import byui.cit260.model.Player;
import byui.cit260.model.Question;
import byui.cit260.model.QuestionLocation;

/**
 *
 * @author jalynzamora
 */
public class Datingsimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Player playerOne = new Player();

        playerOne.setName("Quavious");

        String playerOneName = playerOne.getName();

        System.out.println("Name = " + playerOneName);

        Game game = new Game();
        game.setTotalDays(5);
        game.setMoney(10);
        game.setPlayer(playerOne);

        System.out.println(game.toString());

        System.out.println(Actor.Quavious.toString());

        Location location = new Location();
        location.setRow(5);
        location.setColumn(5);
        location.setDisplaySymbol(3);
        location.setDescription("The park with big trees");
        location.setVisited(true);

        System.out.println(location.toString());

        QuestionLocation questionLocation = new QuestionLocation();
        questionLocation.setRequiredCorrect(true);
        questionLocation.setNoCorrect(false);
        questionLocation.setType("Gym");

        System.out.println(questionLocation.toString());

        Question question = new Question();
        question.setQuestion(" What are you doing tonight?");
        question.setAnswer(" Not much, what about you?");
        question.setRequired(true);
        question.setNumPoints(42);

        System.out.println(question.toString());
    }
}
