package com.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");


        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setBounds(400,200,500,500);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);



        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
