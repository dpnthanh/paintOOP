/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintoop;

import java.awt.Color;

/**
 *
 * @author stephen
 */
public class ShapeMaker {

    public static Shape createRectangle(
            int PositionX, int PositionY, int Width, int Length, Color color, Boolean Fill) {
        if(Fill){
            return new FillRectangle(PositionX, PositionY, Width, Length, color);
        } else {
            return new DrawRectangle(PositionX, PositionY, Width, Length, color);
        }
    }

    public static Shape createOval(
            int PositionX, int PositionY, int Width, int Length, Color color, Boolean Fill) {
        if(Fill){
            return new FillOval(PositionX, PositionY, Width, Length, color);
        } else {
            return new DrawOval(PositionX, PositionY, Width, Length, color);
        }
        
    }
}
