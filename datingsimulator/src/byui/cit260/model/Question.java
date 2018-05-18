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
public class Question implements Serializable {

    private String question;
    private String answer;
    private String required;
    private double numPoints;

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public double getNumPoints() {
        return numPoints;
    }

    public void setNumPoints(double numPoints) {
        this.numPoints = numPoints;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.question);
        hash = 41 * hash + Objects.hashCode(this.answer);
        hash = 41 * hash + Objects.hashCode(this.required);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.numPoints) ^ (Double.doubleToLongBits(this.numPoints) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Question{" + "question=" + question + ", answer=" + answer + ", required=" + required + ", numPoints=" + numPoints + '}';
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
        final Question other = (Question) obj;
        if (Double.doubleToLongBits(this.numPoints) != Double.doubleToLongBits(other.numPoints)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.required, other.required)) {
            return false;
        }
        return true;
    }
}
