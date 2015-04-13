/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockdemo;

import environment.Environment;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author kevin.lawrence
 */
class ClockEnvironment extends Environment {
    private Point position;
    private char character;
    private Dimension size;
    
    
    {
        position = new Point(10, 10);
        size = new Dimension(40, 60);
        character = '0';
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        character = e.getKeyChar();
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.drawString(String.valueOf(character), 300, 300);
        
        Point clockPosition = new Point(position);
        DigitalClock.drawClock(graphics, Color.CYAN, clockPosition, new Dimension(280, 90), 24, 34, 56);
        
//        Point myPosition = new Point(position.x, position.y + 200);
//        for (int i = 0; i < 5; i++) {
//            myPosition.x += size.width + 10; 
//            DigitalCharacter.drawCharacter(graphics, character, myPosition, size, Color.BLUE);
////            
//        }
        size.width = 50;
        size.height = 100;
        
        Point lg = new Point(20, 120);
        
        for (int i = 0; i < 10; i++) {
            LightboardCharacter.drawCharacter(graphics, String.valueOf(i).charAt(0), lg, size, Color.BLACK);            
            lg.x += size.width + 10;
        }

        lg = new Point(20, 250);
        int charBase = 65;
        for (int i = 0; i < 13; i++) {
            LightboardCharacter.drawCharacter(graphics, (char) (i + charBase), lg, size, Color.yellow);            
            lg.x += size.width + 10;
        }

        lg = new Point(20, 400);
        for (int i = 13; i < 26; i++) {
            LightboardCharacter.drawCharacter(graphics, (char) (i + charBase), lg, size, Color.yellow);            
            lg.x += size.width + 10;  
        }
//        LightboardCharacter.drawCharacter(graphics, '1', new Point(100, 20), size, Color.yellow);
//        LightboardCharacter.drawCharacter(graphics, '2', new Point(340, 20), size, Color.yellow);
//        LightboardCharacter.drawCharacter(graphics, '3', new Point(580, 20), size, Color.yellow);
        
//        DigitalCharacter.drawCharacter(graphics, character, position, size, Color.BLUE);
//        DigitalCharacter.drawCharacter(graphics, character, position, size, Color.BLUE);
    }
   
}
