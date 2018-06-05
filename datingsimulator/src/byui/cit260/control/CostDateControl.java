/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

/**
 *
 * @author noahadams
 */
public class CostDateControl {

    public static double costDate(double yourFood, double theirFood, double tipPercent) {
        if (yourFood < 10 || yourFood > 25) {
            return -1;
        }
        if (theirFood < 10 || theirFood > 25) {
            return -2;
        }

        if (tipPercent < 0.1 || tipPercent > 0.20) {
            return -3;
        }
        double costDate = (yourFood + theirFood) * (tipPercent) + (yourFood + theirFood);
        return costDate;
    }
}
