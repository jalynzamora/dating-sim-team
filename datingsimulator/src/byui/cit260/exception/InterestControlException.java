/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.exception;

/**
 *
 * @author jalynzamora
 */
public class InterestControlException extends Exception{

    public InterestControlException() {
    }

    public InterestControlException(String message) {
        super(message);
    }

    public InterestControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public InterestControlException(Throwable cause) {
        super(cause);
    }

    public InterestControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
