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
        String[] inputs = new String[1];
        System.out.println("Description of the view");
        boolean valid = false;
        while (valid == false) {
            Scanner inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();

            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            valid = true;
        }
        return inputs;
    }
}
