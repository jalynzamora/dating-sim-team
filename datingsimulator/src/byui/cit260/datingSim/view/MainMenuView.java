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
class MainMenuView {

   public void displayMainMenuView() {
         boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].length() < 1 || inputs[0].equals("Q")) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private String[] getInputs() {
      String[] inputs = new String[1];
        System.out.println("N - New game");
        System.out.println("R - Restart game");
        System.out.println("H - Get help");
        System.out.println("Q - Quit");
  
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
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem){
            case "N": this.startNewGame();
            break;
            case "R": this.restartGame();
            break;
            case "H": this.getHelp();
            break;
            case "Q": return true;
            default:
                System.out.println("Invaild menu item.");   
        }
        return false;
    }

    private void startNewGame() {
        
    }

    private void getHelp() {
       
    }

    private void restartGame() {
       
    }
    }
