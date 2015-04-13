/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clockdemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author kevin.lawrence
 */
public class DigitalClock {
    Point position;
    Dimension size;
    Color foreground;
    
    {
        
    }
    
    
    private static char intToChar(int number){
        if ((number > 9) || (number < 0)){
            return ' ';
        }
        return String.valueOf(number).charAt(0);
    }
    
    public static void drawClock(Graphics graphics, Color foreground, Point position, Dimension size, int hours, int minutes, int seconds){
        
        graphics.drawRect(position.x, position.y, size.width, size.height);
        
        int charWidth = (size.width / 7) + 1;
        Dimension charSize = new Dimension((size.width / 7) - 2, size.height);
        char number = ' ';
        
        graphics.setColor(Color.BLACK);
        graphics.drawString(String.format("%d : %d : %d", hours, minutes, seconds), position.x - 20, position.y - 20);
        
        graphics.setColor(foreground);
        
        
        //draw hours
        DigitalCharacter.drawCharacter(graphics, intToChar(hours / 10), position, charSize, foreground);

        position.x += charWidth;
        DigitalCharacter.drawCharacter(graphics, intToChar(hours % 10), position, charSize, foreground);
        
        //leave space for separator
        position.x += (charWidth / 2) - 1;

        position.x += charWidth;
        DigitalCharacter.drawCharacter(graphics, intToChar(minutes / 10), position, charSize, foreground);
        
        position.x += charWidth;
        DigitalCharacter.drawCharacter(graphics, intToChar(minutes % 10), position, charSize, foreground);
        
        //leave space for separator
        position.x += (charWidth / 2) - 1;

        position.x += charWidth;
        DigitalCharacter.drawCharacter(graphics, intToChar(seconds / 10), position, charSize, foreground);
        
        position.x += charWidth;
        DigitalCharacter.drawCharacter(graphics, intToChar(seconds % 10), position, charSize, foreground);
        
    }
    
    
}
