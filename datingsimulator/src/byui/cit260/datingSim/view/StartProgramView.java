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
public class StartProgramView {

    public StartProgramView() {
    }

    public void displayStartProgramView() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].length() < 1 || inputs[0].equals("Q")) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);

    }

    private boolean doAction(String[] inputs) {
        System.out.println("**** doAction () called ***");
        System.out.println("\tinputs = " + inputs[0]);
        return true;
    }

    private String[] getInputs() {
        /**
         * getInputs(): String[] {
         *
         * inputs = new String array one element long Display a description of
         * the view
         *
         * valid = false WHILE valid == false (no input value has been entered)
         *
         * Display the prompt message Get the value entered from the keyboard
         * Trim off leading and trailing blanks from the value IF length of the
         * value < 1 then Display "You must enter a non-blank value” Continue
         * (move to the top of the loop and repeat) ENDIF Assign the value to
         * the fist position in the inputs array valid = true (ends the loop)
         * ENDWHILE
         *
         * RETURN inputs
         */

        String[] inputs = new String[1];
        System.out.println("Description of the view");
        boolean valid = false;
        while (valid == false) {
            Scanner inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();
        }
        return inputs;
    }
}
