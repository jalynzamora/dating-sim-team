/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

/**
 *
 * @author jalynzamora
 */
public class ShopView extends View {

    public ShopView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String shop = this.getInput("G - Gym Clothes $20\n" + "F - Frisbee $10\n" + "C - Calculator $10\n" + "Q - Go back to main menu");
        inputs[0] = shop;
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "G":
                this.GymClothes();
                break;
            case "F":
                this.Frisbee();
                break;
            case "C":
                this.Calc();
                break;
            case "Q":
                return true;
            default:
                this.console.println("Invaild item.");
        }
        return false;
    }

    private void GymClothes() {
       this.console.println("You just bought new gym clothes, it cost $20.");
    }

    private void Frisbee() {
        this.console.println("You just bought new a new frisbee, it cost $10.");
    }

    private void Calc() {
       this.console.println("You just bought new a new calculator, it cost $10.");
    }
    
}
