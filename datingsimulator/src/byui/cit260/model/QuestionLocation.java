/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author noahadams
 */
public class QuestionLocation extends Location {

    private int requiredCorrect;
    private int noCorrect;
    
    private ArrayList<Question> question = new ArrayList();

    public QuestionLocation() {
    }

    public QuestionLocation(int requiredCorrect, int noCorrect, double row, double column, String displaySymbol, String description, boolean visited) {
        super(row, column, displaySymbol, description, visited);
        this.requiredCorrect = requiredCorrect;
        this.noCorrect = noCorrect;
    }

    public int getRequiredCorrect() {
        return requiredCorrect;
    }

    public void setRequiredCorrect(int requiredCorrect) {
        this.requiredCorrect = requiredCorrect;
    }

    public int getNoCorrect() {
        return noCorrect;
    }

    public void setNoCorrect(int noCorrect) {
        this.noCorrect = noCorrect;
    }
    
   
    
    public ArrayList<Question> getQuestion() {
        return question;
    }

    public void setQuestion(ArrayList<Question> question) {
        this.question = question;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.requiredCorrect);
        hash = 43 * hash + Objects.hashCode(this.noCorrect);
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionLocation{" + "requiredCorrect=" + requiredCorrect + ", noCorrect=" + noCorrect +  '}';
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
        return true;
    }
}
