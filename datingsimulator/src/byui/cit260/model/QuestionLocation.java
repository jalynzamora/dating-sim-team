/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author noahadams
 */
public class QuestionLocation extends Location {

    private boolean requiredCorrect;
    private boolean noCorrect;
    private String type;

    public QuestionLocation() {
    }

    public boolean isRequiredCorrect() {
        return requiredCorrect;
    }

    public void setRequiredCorrect(boolean requiredCorrect) {
        this.requiredCorrect = requiredCorrect;
    }

    public boolean isNoCorrect() {
        return noCorrect;
    }

    public void setNoCorrect(boolean noCorrect) {
        this.noCorrect = noCorrect;
    }

    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.requiredCorrect);
        hash = 43 * hash + Objects.hashCode(this.noCorrect);
        hash = 43 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionLocation{" + "requiredCorrect=" + requiredCorrect + ", noCorrect=" + noCorrect + ", type=" + type + '}';
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
        final QuestionLocation other = (QuestionLocation) obj;
        if (!Objects.equals(this.requiredCorrect, other.requiredCorrect)) {
            return false;
        }
        if (!Objects.equals(this.noCorrect, other.noCorrect)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
}
