package com.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        Panel panel1 = new Panel();
        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(140, 234, 78));
        frame.setVisible(true);
        frame.setResizable(false);

        panel.setBounds(50,50,200,200);
        panel1.setBounds(250,250,200,200);
        panel.setBackground(new Color(234, 78, 138));
        panel1.setBackground(new Color(234, 78, 138));
        panel.setVisible(true);
        frame.add(panel1);
        frame.add(panel);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
