/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintoop;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author stephen
 */
public class Drawer {

    private JPanel panel;
    private int widthPanel;
    private int heightPanel;
    private Graphics grapphic;

    ArrayList<Shape> listShape = new ArrayList<>();

    public Drawer(JPanel Panel) {
        this.panel = Panel;
        this.widthPanel = Panel.getWidth();
        this.heightPanel = Panel.getHeight();
        grapphic = Panel.getGraphics();
    }

    public void addShape(Shape shape) {
        this.listShape.add(shape);
    }

    public void drawLastShape() {
        listShape.get(listShape.size() - 1).draw(grapphic);
    }

    public void reDraw() {
        grapphic.clearRect(0, 0, widthPanel, heightPanel);
        grapphic.setColor(Color.white);
        grapphic.fillRect(0, 0, widthPanel, heightPanel);
        
        for (int i = 0; i < listShape.size(); i++) {
            Shape shape = listShape.get(i);
            shape.draw(grapphic);
        }
        
    }

    public void undo() {
        System.out.println("undo");
        listShape.remove(listShape.size() - 1);
        this.reDraw();
    }
}
