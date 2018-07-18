/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.datingSim.view;

import datingsimulator.Datingsimulator;
import java.io.PrintWriter;

/**
 *
 * @author jalynzamora
 */
public class ErrorView {
    private static PrintWriter console = Datingsimulator.getOutFile();
    private static PrintWriter log = Datingsimulator.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        console.println(
                  "\n--- ERROR ---------------------------------------------------"
                + "\n" + errorMessage
                + "\n-------------------------------------------------------------");
        log.printf("%%%%", className + " - " + errorMessage);
    }
}
