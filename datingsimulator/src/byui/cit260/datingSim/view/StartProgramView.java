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
public class StartProgramView {

    public StartProgramView() {
    }
  

    public void displayStartProgramView() {
        boolean endOfView = false;
           do {
               String[] inputs = getInputs();
               if(inputs[0].length() < 1 || inputs[0].equals("Q")){
                   return;
               }
               endOfView = doAction(inputs);
               
           } while(endOfView != true);
           
    }

    private boolean doAction(String[] inputs) {
        
    }

    private String[] getInputs() {
       
    }
    
}
