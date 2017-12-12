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
public class DrawRectangle extends Shape{
    
    public DrawRectangle(){
        
    }
    
    public DrawRectangle(int positionX, int positionY, int Width, int lenght, Color color) {
        super(positionX, positionY, Width, lenght, color);
    }

    @Override
    public void draw(Graphics gr) {
        gr.setColor(this.getColor());
        gr.drawRect(this.getPositionX(), this.getPositionY(), this.getWidth(), this.getLenght());
    }
    
}
