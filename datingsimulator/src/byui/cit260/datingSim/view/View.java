/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import byui.cit260.model.Player;
import datingsimulator.Datingsimulator;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author noahadams
 */
public abstract class View implements ViewInterface {

    private String message;

    protected final BufferedReader keyboard = Datingsimulator.getInFile();
    protected final PrintWriter console = Datingsimulator.getOutFile();

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
try{
        while (valid == false) {
            value = this.keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            break;
        }
}catch(Exception e){
    System.out.println("Error reading input: " + e.getMessage());
}
        return value;
    }
}
