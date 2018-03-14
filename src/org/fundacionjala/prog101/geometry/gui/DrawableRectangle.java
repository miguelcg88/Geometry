package org.fundacionjala.prog101.geometry.gui;

import java.awt.*;

public class DrawableRectangle implements Drawable{

    private final Point start;
    private final Point end;

    public DrawableRectangle(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.drawRect(start.x, start.y, end.x - start.x, end.y - start.y);
    }
}
