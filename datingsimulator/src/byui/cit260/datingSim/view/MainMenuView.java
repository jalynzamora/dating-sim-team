/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

/**
 *
 * @author noahadams
 */
class MainMenuView {

    void displayMainMenuView() {
         boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].length() < 1 || inputs[0].equals("Q")) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);

    }

    private boolean getInputs() {
      System.out.println("*** MainMenuview - getInputs() called ***");
      boolean Strs = true;
      return Strs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("**** MainMenuView - doAction() called ***");
                return true;
    }
    }
