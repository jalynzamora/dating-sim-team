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
class GameMenuView {

    public GameMenuView() {
    }

    public void displayGameMenuView() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();

            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("**************************");
        System.out.println("M - Map\n" + "P - Where am I\n" + "T - Socialize\n" + "A - Ask out on date\n"
                + "R - View relationship status\n" + "I - View inventory\n" + "S - Save\n" + "W - Work\n" + "Q - Go back to main menu");
        System.out.println("**************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter the selected menu item.");
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

    private boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
