/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.util.Objects;

/**
 *
 * @author jalynzamora
 */
public class Relationship {
    private long relationshipStatus;
    private String relationshipStrength;
    private Actor actor1;
    private Actor actor2;

    public Relationship() {
    }

    public long getRelationshipStatus() {
        return relationshipStatus;
    }

    public void setRelationshipStatus(long relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    public String getRelationshipStrength() {
        return relationshipStrength;
    }

    public void setRelationshipStrength(String relationshipStrength) {
        this.relationshipStrength = relationshipStrength;
    }

    public Actor getActor1() {
        return actor1;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public Actor getActor2() {
        return actor2;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (this.relationshipStatus ^ (this.relationshipStatus >>> 32));
        hash = 17 * hash + Objects.hashCode(this.relationshipStrength);
        hash = 17 * hash + Objects.hashCode(this.actor1);
        hash = 17 * hash + Objects.hashCode(this.actor2);
        return hash;
    }

    @Override
    public String toString() {
        return "Relationship{" + "relationshipStatus=" + relationshipStatus + ", relationshipStrength=" + relationshipStrength + ", actor1=" + actor1 + ", actor2=" + actor2 + '}';
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
        final Relationship other = (Relationship) obj;
        if (this.relationshipStatus != other.relationshipStatus) {
            return false;
        }
        if (!Objects.equals(this.relationshipStrength, other.relationshipStrength)) {
            return false;
        }
        if (this.actor1 != other.actor1) {
            return false;
        }
        if (this.actor2 != other.actor2) {
            return false;
        }
        return true;
    }
    
}
