package org.fundacionjala.prog101.geometry.gui;

import java.awt.*;

public class DrawableCircle implements Drawable{

    private final Point start,radius;

    public DrawableCircle(Point start ,Point radius) {
        this.start = start;
        this.radius = radius;

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.white);
        int r = (int)start.distance(radius);
        g.drawOval(start.x-r, start.y-r, 2*r, 2*r);
    }
}