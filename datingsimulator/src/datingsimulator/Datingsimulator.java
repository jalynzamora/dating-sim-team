/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datingsimulator;

import byui.cit260.datingSim.view.StartProgramView;
import byui.cit260.model.Game;
import byui.cit260.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jalynzamora
 */
public class Datingsimulator {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static void main(String[] args) {
        try {

            Datingsimulator.inFile = new BufferedReader(new InputStreamReader(System.in));
            Datingsimulator.outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        } catch (Throwable ex) {
            System.out.println(ex.fillInStackTrace());
        } finally {
            try {
                if (Datingsimulator.inFile != null) {
                    Datingsimulator.inFile.close();
                }

                if (Datingsimulator.outFile != null) {
                    Datingsimulator.outFile.close();
                }
                
                if(logFile != null){
                    logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files.");
                return;
            }

        }
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Datingsimulator.logFile = logFile;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Datingsimulator.outFile = outFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Datingsimulator.inFile = inFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Datingsimulator.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Datingsimulator.player = player;
    }
}
