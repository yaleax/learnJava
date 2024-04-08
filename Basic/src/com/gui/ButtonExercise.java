package com.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonExercise {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button10 = new Button("10");

        frame.setBounds(1500,250,1000,500);
        frame.setLayout(new GridLayout(2,1));
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        panel1.add(button1,BorderLayout.WEST);
        panel1.add(button4,BorderLayout.EAST);
        panel2.add(button2);
        panel2.add(button3);
        panel1.add(panel2,BorderLayout.CENTER);

        panel3.add(button5,BorderLayout.WEST);
        panel3.add(button10,BorderLayout.EAST);
        panel4.add(button6);
        panel4.add(button7);
        panel4.add(button8);
        panel4.add(button9);
        panel3.add(panel4,BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);



        panel1.setVisible(true);

        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
