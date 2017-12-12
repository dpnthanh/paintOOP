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
public abstract class Shape {
    
    private int positionX;
    private int positionY;
    private int width;
    private int lenght;
    private Color color;
    
    public Shape(){
        positionX = positionY = 0;
        width = lenght = 50;
        color = Color.black;
    }

    public Shape(int positionX, int positionY, int Width, int lenght, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = Width;
        this.lenght = lenght;
        this.color = color;
    }
    
    public void setProperties(int positionX, int positionY, int Width, int lenght, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = Width;
        this.lenght = lenght;
        this.color = color;
    }
    
    public abstract void draw(Graphics gr);

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int Width) {
        this.width = Width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
}
