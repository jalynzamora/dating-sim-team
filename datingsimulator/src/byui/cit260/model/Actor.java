/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author noahadams
 */
public enum Actor implements Serializable {
    Fred("Fred", "Male", new Point(1, 1)),
    Jimmy("Jimmy", "Male", new Point(2, 1)),
    Quavious("Quavious", "Male", new Point(3, 1)),
    Daphne("Daphne", "Female", new Point(0, 1)),
    Velma("Velma", "Female", new Point(1, 0)),
    Cardi("Cardi", "Female", new Point(2, 0)),
    Playerm("Playerm", "Male", new Point (3, 1));
    

    private final String name;
    private  final String gender;
    private final Point coordinates;

    private final ArrayList<Relationship> relationships = new ArrayList<>();
    
    Actor(String name, String gender, Point coordinates) {
        this.name = name;
        this.gender = gender;
        this.coordinates = coordinates;
    }
    

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public ArrayList<Relationship> getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", gender=" + gender + ", coordinates=" + coordinates + ", relationships=" + relationships + '}';
    }
    
    
}
