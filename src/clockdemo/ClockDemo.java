/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockdemo;

import environment.ApplicationStarter;
import java.awt.Dimension;

/**
 *
 * @author kevin.lawrence
 */
public class ClockDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run(new String[0], "Clock Test!", new Dimension(1400, 700), new ClockEnvironment());
    }
    
}
