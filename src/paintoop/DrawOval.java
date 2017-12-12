/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintoop;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author stephen
 */
public class DrawOval extends Shape{
    
    public DrawOval(){
        
    }

    public DrawOval(int PositionX, int PositionY, int Width, int Lenght, Color color){
        super(PositionX, PositionY, Width, Lenght, color);
    }
    @Override
    public void draw(Graphics gr) {
        gr.setColor(this.getColor());
        gr.drawOval(this.getPositionX(), this.getPositionY(), this.getWidth(), this.getLenght());
    }
    
}
