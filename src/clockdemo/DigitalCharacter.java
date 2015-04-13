package clockdemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.EnumSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kevin.lawrence
 */
public class DigitalCharacter {

    public static enum SevenSegment {

        TopLeftVertical, TopHorizontal, TopRightVertical, MiddleHorizontal, BottomLeftVertical, BottomRightVertical, BottomHoriztonal
    }
    public static final EnumSet<SevenSegment> VerticalDisplayPanels = EnumSet.of(SevenSegment.TopLeftVertical, SevenSegment.TopRightVertical, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical);
    public static final EnumSet<SevenSegment> HorizontalDisplayPanels = EnumSet.of(SevenSegment.TopHorizontal, SevenSegment.MiddleHorizontal, SevenSegment.BottomHoriztonal);
    public static SevenSegment[] DC_SPACE = {};
//    public static SevenSegment[] DC_A = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical};
//    public static SevenSegment[] DC_B = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_C = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_D = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_E = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_F = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_G = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_H = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_I = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_J = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_K = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_L = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_M = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_N = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_O = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_P = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_Q = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_R = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_S = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_T = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_U = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_V = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_W = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_X = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_Y = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
//    public static SevenSegment[] DC_Z = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
    public static SevenSegment[] DC_0 = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
    public static SevenSegment[] DC_1 = {SevenSegment.TopRightVertical, SevenSegment.BottomRightVertical};
    public static SevenSegment[] DC_2 = {SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomHoriztonal};
    public static SevenSegment[] DC_3 = {SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
    public static SevenSegment[] DC_4 = {SevenSegment.TopLeftVertical, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomRightVertical};
    public static SevenSegment[] DC_5 = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.MiddleHorizontal, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
    public static SevenSegment[] DC_6 = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
    public static SevenSegment[] DC_7 = {SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.BottomRightVertical};
    public static SevenSegment[] DC_8 = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomLeftVertical, SevenSegment.BottomRightVertical, SevenSegment.BottomHoriztonal};
    public static SevenSegment[] DC_9 = {SevenSegment.TopLeftVertical, SevenSegment.TopHorizontal, SevenSegment.TopRightVertical, SevenSegment.MiddleHorizontal, SevenSegment.BottomRightVertical};
    
    
    
    
    private Dimension size;
    private char character;
    private Color background;
    private Color foreground;

    {
        background = Color.LIGHT_GRAY;
        foreground = Color.RED;
        character = ' ';
        size = new Dimension(10, 10);

    }

    private static SevenSegment[] getPanels(char character) {
        switch (character) {
            case '0':
                return DC_0;
            case '1':
                return DC_1;
            case '2':
                return DC_2;
            case '3':
                return DC_3;
            case '4':
                return DC_4;
            case '5':
                return DC_5;
            case '6':
                return DC_6;
            case '7':
                return DC_7;
            case '8':
                return DC_8;
            case '9':
                return DC_9;
            case ' ':
            default:
                return DC_SPACE;
        }
    }

    public static void drawCharacter(Graphics graphics, char character, Point position, Dimension size, Color color) {
        drawPanels(graphics, getPanels(character), position, size, color);
    }

    public static void drawPanels(Graphics graphics, SevenSegment[] panels, Point position, Dimension size, Color color) {
        int points = 6;
        int BASE_VERTICAL = 16;

        // Generic vertical panel (same as top left)
        int[] xVerticalPanel = new int[points];
        int[] yVerticalPanel = new int[points];

        xVerticalPanel[0] = (size.width * 2 / BASE_VERTICAL);
        xVerticalPanel[1] = 0;
        xVerticalPanel[2] = 0;
        xVerticalPanel[3] = (size.width * 2 / BASE_VERTICAL);
        xVerticalPanel[4] = (size.width * 4 / BASE_VERTICAL);
        xVerticalPanel[5] = (size.width * 4 / BASE_VERTICAL);

        yVerticalPanel[0] = (size.height * 1 / BASE_VERTICAL);
        yVerticalPanel[1] = (size.height * 2 / BASE_VERTICAL);
        yVerticalPanel[2] = (size.height * 7 / BASE_VERTICAL);
        yVerticalPanel[3] = (size.height * 8 / BASE_VERTICAL);
        yVerticalPanel[4] = (size.height * 7 / BASE_VERTICAL);
        yVerticalPanel[5] = (size.height * 2 / BASE_VERTICAL);


        // use these to shift generic to top / bottom and left / right positions
        int xVerticalLeft = 0;
        int xVerticalRight = size.width * 12 / BASE_VERTICAL;
        int yVerticalTop = 0;
        int yVerticalBottom = size.height * 7 / BASE_VERTICAL;


        // Generic horizontal panel (same as top)
        int[] xHorizontalPanel = new int[points];
        int[] yHorizontalPanel = new int[points];

        xHorizontalPanel[0] = (size.width * 2 / BASE_VERTICAL) + 1;
        xHorizontalPanel[1] = (size.width * 4 / BASE_VERTICAL) + 1;
        xHorizontalPanel[2] = (size.width * 12 / BASE_VERTICAL) - 1;
        xHorizontalPanel[3] = (size.width * 14 / BASE_VERTICAL) - 1;
        xHorizontalPanel[4] = (size.width * 12 / BASE_VERTICAL) - 1;
        xHorizontalPanel[5] = (size.width * 4 / BASE_VERTICAL) + 1;

        yHorizontalPanel[0] = (size.height * 1 / BASE_VERTICAL);
        yHorizontalPanel[1] = (size.height * 2 / BASE_VERTICAL);
        yHorizontalPanel[2] = (size.height * 2 / BASE_VERTICAL);
        yHorizontalPanel[3] = (size.height * 1 / BASE_VERTICAL);
        yHorizontalPanel[4] = 0;
        yHorizontalPanel[5] = 0;

        int yHorizontalTop = 0;
        int yHorizontalMiddle = (size.height * 7) / BASE_VERTICAL;
        int yHorizontalBottom = (size.height * 14) / BASE_VERTICAL;

        int[] xs = new int[points];
        int[] ys = new int[points];
        int xOffset = 0;
        int yOffset = 0;

        for (SevenSegment panel : panels) {

            if (VerticalDisplayPanels.contains(panel)) {
                System.arraycopy(xVerticalPanel, 0, xs, 0, xVerticalPanel.length);
                System.arraycopy(yVerticalPanel, 0, ys, 0, yVerticalPanel.length);
            } else {
                System.arraycopy(xHorizontalPanel, 0, xs, 0, xHorizontalPanel.length);
                System.arraycopy(yHorizontalPanel, 0, ys, 0, yHorizontalPanel.length);
            }

            //offset the panels first
            switch (panel) {
                case TopLeftVertical:
                    xOffset = xVerticalLeft;
                    yOffset = yVerticalTop;
                    break;

                case TopHorizontal:
                    xOffset = 0;
                    yOffset = yHorizontalTop;
                    break;

                case TopRightVertical:
                    xOffset = xVerticalRight;
                    yOffset = yVerticalTop;
                    break;

                case MiddleHorizontal:
                    xOffset = 0;
                    yOffset = yHorizontalMiddle;
                    break;

                case BottomLeftVertical:
                    xOffset = xVerticalLeft;
                    yOffset = yVerticalBottom;
                    break;

                case BottomRightVertical:
                    xOffset = xVerticalRight;
                    yOffset = yVerticalBottom;
                    break;

                case BottomHoriztonal:
                    xOffset = 0;
                    yOffset = yHorizontalBottom;
                    break;
            }

            //offset the panels using the computed offset values
            for (int i = 0; i < xs.length; i++) {
                xs[i] += xOffset;
                ys[i] += yOffset;
            }

            //position the scaled and offset panels
            for (int i = 0; i < xs.length; i++) {
                xs[i] += position.x;
                ys[i] += position.y;
            }

            //draw the panels
            graphics.setColor(color);
            graphics.fillPolygon(xs, ys, points);

            graphics.setColor(Color.BLACK);
            graphics.drawPolygon(xs, ys, points);
        }
    }

    private static void drawPanel(Graphics graphics, Point position, Dimension size, Color color) {
        graphics.setColor(color);
        graphics.drawLine(position.x, position.y, position.x + size.width, position.y + size.height);
    }
}
