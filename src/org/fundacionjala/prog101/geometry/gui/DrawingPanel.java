package org.fundacionjala.prog101.geometry.gui;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends javax.swing.JPanel {

    private List<Drawable> drawables;
    private Point start, end;
    private String mode;

    public DrawingPanel() {
        super();
        setMode("");
        setBackground(Color.lightGray);

        drawables = new ArrayList<>();

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if (getMode().equals("point")) {
                    drawables.add(new DrawablePoint(e.getPoint()));
                }
                else if (getMode().equals("rectangle")) {
                    if (start == null) {
                        start = e.getPoint();
                    }
                    else {
                        end = e.getPoint();
                        drawables.add(new DrawableRectangle(start, end));
                        start = null;
                    }
                }

                else if (getMode().equals("circle")) {
                    if (start == null) {
                        start = e.getPoint();
                    }
                    else {
                        end = e.getPoint();
                        drawables.add(new DrawableCircle(start, end));
                        start = null;
                    }
                }


                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawAxis(g);

        for (Drawable drawable : drawables) {
            drawable.draw(g);
        }
    }

    private void drawAxis(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
