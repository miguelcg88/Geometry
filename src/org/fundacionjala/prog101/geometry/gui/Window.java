package org.fundacionjala.prog101.geometry.gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {

    private JButton pointButton;
    private JButton rectangleButton;
    private JButton circleButton;
    private JButton eraseButton;
    private DrawingPanel drawPanel;
    private JLabel actionLabel;
    private JPanel buttonsPanel;

    private String action;

    public Window(String title) {
        super(title);

        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());
        pointButton = new JButton("Point");
        rectangleButton = new JButton("Rectangle");
        circleButton = new JButton("Circle");
        eraseButton = new JButton("Erase");

        buttonsPanel.add(pointButton);
        buttonsPanel.add(rectangleButton);
        buttonsPanel.add(circleButton);
        buttonsPanel.add(eraseButton);


        pointButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                action = "point";
                actionLabel.setText(action);
                drawPanel.setMode(action);
            }
        });

        eraseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = "erase";
                actionLabel.setText(action);
                drawPanel.setMode(action);
            }
        });

        rectangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = "rectangle";
                actionLabel.setText(action);
                drawPanel.setMode(action);
            }
        });

        circleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = "circle";
                actionLabel.setText(action);
                drawPanel.setMode(action);
            }
        });

        drawPanel = new DrawingPanel();


        actionLabel = new JLabel("action label: none");

        this.getContentPane().setLayout(new BorderLayout());

        this.getContentPane().add(buttonsPanel, BorderLayout.NORTH);
        //this.getContentPane().add(actionTextField, BorderLayout.SOUTH);
        this.getContentPane().add(actionLabel, BorderLayout.SOUTH);
        this.getContentPane().add(drawPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame window = new Window("Geometry App");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setSize(300, 250);

        window.setVisible(true);
    }
}

