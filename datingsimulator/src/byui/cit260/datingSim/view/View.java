/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.model.Player;
import java.util.Scanner;

/**
 *
 * @author noahadams
 */
public abstract class View implements ViewInterface {

    public View() {
    }
    @Override
    public void display() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].length() < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);

    }

    @Override
    public String getInput(String promptMessage) {
        String value = "";
        System.out.println(promptMessage);
        boolean valid = false;
        
        while (valid == false) {
            Scanner inFile = new Scanner(System.in);
            value = inFile.nextLine();

            if (value.length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            valid = true;
        }
        return value;
    }
}


