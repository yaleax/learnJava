package com.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button east = new Button("East");
        Button west = new Button("West");
        Button south = new Button("South");
        Button north = new Button("North");
        Button center = new Button("Center");
        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);
        frame.setBounds(200,400,500,500);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
