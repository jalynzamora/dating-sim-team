/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author jalynzamora
 */
public class Game implements Serializable {

    private double totalDays;
    private double money;
    private Player player;
   
    private InventoryItem[] inventory;
    private Map map;
    
    public Game() {
    }

    public double getTotalDays() {
        return totalDays;
    }

    public double getMoney() {
        return money;
    }

    public Player getPlayer() {
        return player;
    }

   

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public Map getMap() {
        return map;
    }

    public void setTotalDays(double totalDays) {
        this.totalDays = totalDays;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

   

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.totalDays) ^ (Double.doubleToLongBits(this.totalDays) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.player);
        hash = 89 * hash + Arrays.deepHashCode(this.inventory);
        hash = 89 * hash + Objects.hashCode(this.map);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalDays=" + totalDays + ", money=" + money + ", player=" + player +  ", inventory=" + inventory + ", map=" + map + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalDays) != Double.doubleToLongBits(other.totalDays)) {
            return false;
        }
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }
}
   

    