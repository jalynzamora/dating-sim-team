/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import byui.cit260.model.InventoryItem;


/**
 *
 * @author jalynzamora
 */
public class InventoryControl {
    public static int seachInventory(InventoryItem[] items, String value ){
        
        for(int index = 0; index < items.length; index++){
            if(items[index].getItemType().equals(value)){
                return index;
            }
        }
        return -1;
    }         
}
