package org.fundacionjala.prog101.geometry.gui;


import java.awt.*;

public class DrawablePoint implements Drawable{


    private final Point point;

    public DrawablePoint(Point point) {
        this.point = point;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(point.x, point.y, 5, 5);
    }
}
