/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Draws a country flag the user specifies
 *
 * @author Benjamin Ameye
 * @version 18/04/2020
 */
public class Flags{

    /**
     * Constructor for objects of class Flags 
     */
    public Flags(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    /**
     * Asking user what flag they want to draw
     * 
     */
    public void DrawFlag(){
        String direction = UI.askString("");
      
    }
    
    public void DrawThreeStripeFlag(double x, double y){
        UI.setColor(Color.black);
        UI.setLineWidth(10);
        UI.drawLine(x, y, x+75, y);
        UI.setColor(Color.red);
        UI.setLineWidth(10);
        UI.drawLine(x, y+10, x+75, y+10);
        UI.setColor(Color.yellow);
        UI.setLineWidth(10);
        UI.drawLine(x, y+20, x+75, y+20);
        
    }

    /**
     * Main routine for drawing flag
     *
     */
    public static void main(String[] args){
        Flags obj = new Flags();
        obj.DrawFlag();
    }

    // double x, double y, double length, String color1, String color2, String color3
}

