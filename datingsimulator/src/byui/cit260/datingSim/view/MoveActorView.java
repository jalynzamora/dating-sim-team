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
public abstract class MoveActorView extends View {

    public MoveActorView() {
    }
    
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];
        System.out.println("To move an actor, enter coordinates to where you want to go within the map.");
        
        String input1 = this.getInput("Enter row:");
        inputs[0] = input1;
        
        String input2 = this.getInput("Enter column:");
        inputs[1] = input2;
        
        return inputs;
    }
    
    /*
    private boolean doAction(String [] inputs) {
 row = get first value in inputs array
 column = get second value in inputs array
 try
 convert the row and column to integers
 catch NumberFormatException
 Print “The row and column must be a number”
 return false to repeat the view
 endTry
 player = get the player from the main class
 actor = get the Actor in the player object

 try
 newLocation = moveActor(actor, row, column)
 catch MapControlException
 Print error passed with the exception
 return false to repeat the view
 endTry
 Print the description of the scene in the
 newLocation
 return true to end the view
}
    */
    
    @Override
    public boolean doAction(String [] inputs) {
        String row = inputs[0];
        String column = inputs[1];
        int intRow;
        int intColumn;
        
        try { 
        intRow = Integer.parseInt(row)-1;
        
        
    }
    
}
