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
public class LightboardCharacter {
//  <editor-fold defaultstate="collapsed" desc="Character Masks">

    public static int[][] LC_SPACE = 
       {{0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0}
       };

    public static int[][] LC_0 = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 1, 1},
        {1, 0, 1, 0, 1},
        {1, 1, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_1 = 
       {{0, 0, 0, 1, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 1, 0},
        {0, 0, 1, 1, 1}
       };

    public static int[][] LC_2 = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 1, 0},
        {0, 1, 1, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}
       };

    public static int[][] LC_3 = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 1, 1, 0},
        {0, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_4 = 
       {{0, 0, 0, 1, 1},
        {0, 0, 1, 0, 1},
        {0, 1, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1}
       };

//    public static int[][] LC_4 = 
//       {{0, 0, 0, 0, 1},
//        {0, 0, 0, 1, 1},
//        {0, 0, 1, 0, 1},
//        {0, 1, 0, 0, 1},
//        {1, 1, 1, 1, 1},
//        {0, 0, 0, 0, 1},
//        {0, 0, 0, 0, 1}
//       };
//
//    public static int[][] LC_4 = 
//       {{0, 0, 0, 1, 0},
//        {0, 0, 1, 1, 0},
//        {0, 1, 0, 1, 0},
//        {1, 0, 0, 1, 0},
//        {1, 1, 1, 1, 1},
//        {0, 0, 0, 1, 0},
//        {0, 0, 0, 1, 0}
//       };
//
    public static int[][] LC_5 = 
       {{1, 1, 1, 1, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0},
        {0, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_6 = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_7 = 
       {{1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 1, 0, 0, 0},
        {0, 1, 0, 0, 0},
        {0, 1, 0, 0, 0}
       };

    public static int[][] LC_8 = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_9 = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_A = 
       {{0, 0, 1, 0, 0},
        {0, 1, 0, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}
       };

    public static int[][] LC_B = 
       {{1, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 0}
       };

    public static int[][] LC_C = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_D = 
       {{1, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 0}
       };

    public static int[][] LC_E = 
       {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}
       };

    public static int[][] LC_F = 
       {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0}
       };

    public static int[][] LC_G = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_H = 
       {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}
       };

    public static int[][] LC_I = 
       {{0, 1, 1, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_J = 
       {{0, 0, 1, 1, 1},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 1, 0},
        {1, 0, 0, 1, 0},
        {0, 1, 1, 0, 0}
       };

    public static int[][] LC_K = 
       {{1, 0, 0, 0, 1},
        {1, 0, 0, 1, 0},
        {1, 0, 1, 0, 0},
        {1, 1, 0, 0, 0},
        {1, 0, 1, 0, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 0, 1}
       };

    public static int[][] LC_L = 
       {{1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0}
       };

    public static int[][] LC_M = 
       {{1, 0, 0, 0, 1},
        {1, 1, 0, 1, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}
       };

    public static int[][] LC_N = 
       {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 0, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 0, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}
       };

    public static int[][] LC_O = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_P = 
       {{1, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0}
       };

    public static int[][] LC_Q = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 0, 1, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_R = 
       {{1, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 0},
        {1, 0, 1, 0, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 0, 1}
       };

    public static int[][] LC_S = 
       {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 0},
        {0, 1, 1, 1, 0},
        {0, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };


    public static int[][] LC_T = 
       {{1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}
       };

    public static int[][] LC_U = 
       {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0}
       };

    public static int[][] LC_V = 
       {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 1, 0, 1, 0},
        {0, 0, 1, 0, 0}
       };

    public static int[][] LC_W = 
       {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 1, 0, 1, 0}
       };

    public static int[][] LC_X = 
       {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 1, 0, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}
       };

    public static int[][] LC_Y = 
       {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}
       };

    public static int[][] LC_Z = 
       {{1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 1, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}
       };

    public static int[][] LC_COLON = 
       {{0, 0, 0, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 0, 0, 0}
       };

    public static int[][] LC_COMMA = 
       {{0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 0, 1, 0}
       };

    public static int[][] LC_PERIOD = 
       {{0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 1, 1, 0}
       };

    public static int[][] LC_NEGATIVE_SIGN = 
       {{0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {1, 1, 1, 1, 1},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0}
       };

    public static int[][] LC_POSITIVE_SIGN = 
       {{0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0}
       };

    public static int[][] LC_SQUARE_ROOT = 
       {{0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 1, 0},
        {1, 0, 1, 0, 0},
        {1, 0, 1, 0, 0},
        {0, 1, 0, 0, 0}
       };

    public static int[][] LC_EXCLAMATION = 
       {{0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}
       };

    public static int[][] getCharacterMask(char character) {
        switch (character) {
            case '0': return LC_0;
            case '1': return LC_1;
            case '2': return LC_2;
            case '3': return LC_3;
            case '4': return LC_4;
            case '5': return LC_5;
            case '6': return LC_6;
            case '7': return LC_7;
            case '8': return LC_8;
            case '9': return LC_9;

            case 'A': return LC_A;
            case 'B': return LC_B;
            case 'C': return LC_C;
            case 'D': return LC_D;
            case 'E': return LC_E;
            case 'F': return LC_F;
            case 'G': return LC_G;
            case 'H': return LC_H;
            case 'I': return LC_I;
            case 'J': return LC_J;
            case 'K': return LC_K;
            case 'L': return LC_L;
            case 'M': return LC_M;
            case 'N': return LC_N;
            case 'O': return LC_O;
            case 'P': return LC_P;
            case 'Q': return LC_Q;
            case 'R': return LC_R;
            case 'S': return LC_S;
            case 'T': return LC_T;
            case 'U': return LC_U;
            case 'V': return LC_V;
            case 'W': return LC_W;
            case 'X': return LC_X;
            case 'Y': return LC_Y;
            case 'Z': return LC_Z;

            case ':': return LC_COLON;
            case '.': return LC_PERIOD;
            case ',': return LC_COMMA;
            case '!': return LC_EXCLAMATION;
        }
        return LC_SPACE;
    }

//    </editor-fold>
    
    
    public static void drawCharacter(Graphics graphics, char character, Point position, Dimension size, Color color) {
        drawCharacter(graphics, getCharacterMask(character), position, size, color);
    }

    public static void drawCharacter(Graphics graphics, int[][] charMask, Point position, Dimension size, Color color) {
        int rows = charMask.length;
        int cols = charMask[0].length;

        int colWidth = size.width / cols;
        int rowHeight = size.height / rows;
        
        int radius = Math.min(colWidth, rowHeight) / 3;
        
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < cols; column++) {
                if (charMask[row][column] == 1) {
                    graphics.setColor(color);
//                    graphics.fill
                    graphics.fillRoundRect(position.x + (column * colWidth), 
                                           position.y + (row * rowHeight), 
                                           colWidth, rowHeight, radius, radius);

                    graphics.setColor(Color.WHITE);
                    graphics.drawOval(position.x + (column * colWidth), 
                                           position.y + (row * rowHeight), 
                                           colWidth, rowHeight);
//                    graphics.drawRoundRect(position.x + (column * colWidth), 
//                                           position.y + (row * rowHeight), 
//                                           colWidth, rowHeight, radius, radius);
                }
            }
        }
    }
}
