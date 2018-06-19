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
public interface ViewInterface {
    public void display();
    public String[] getInputs();
    public String getInput(String promptmessage);
    public boolean doAction(String[] inputs);
    
}
