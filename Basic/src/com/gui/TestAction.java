package com.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestAction {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel1 = new Panel(new GridLayout(4,3));
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button0 = new Button("0");
        Button buttonAdd = new Button("+");
        Button buttonSub = new Button("-");

        panel1.add( button1);
        panel1.add( button2);
        panel1.add( button3);
        panel1.add( button4);
        panel1.add( button5);
        panel1.add( button6);
        panel1.add( button7);
        panel1.add( button8);
        panel1.add( button9);
        panel1.add( buttonAdd);
        panel1.add( button0);
        panel1.add( buttonSub);

        frame.add(panel1);

        MyActionListener l1 = new MyActionListener(1);
        MyActionListener l2 = new MyActionListener(2);
        MyActionListener l3 = new MyActionListener(3);
        MyActionListener l4 = new MyActionListener(4);
        MyActionListener l5 = new MyActionListener(5);
        MyActionListener l6 = new MyActionListener(6);
        MyActionListener l7 = new MyActionListener(7);
        MyActionListener l8 = new MyActionListener(8);
        MyActionListener l9 = new MyActionListener(9);
        MyActionListener l0 = new MyActionListener(0);
        MyActionListener ladd = new MyActionListener(11);
        MyActionListener lsub = new MyActionListener(12);

        button1.addActionListener(l1);
        button2.addActionListener(l2);
        button3.addActionListener(l3);
        button4.addActionListener(l4);
        button5.addActionListener(l5);
        button6.addActionListener(l6);
        button7.addActionListener(l7);
        button8.addActionListener(l8);
        button9.addActionListener(l9);
        button0.addActionListener(l0);
        buttonAdd.addActionListener(ladd);
        buttonSub.addActionListener(lsub);


        frame.setBounds(200,200,1000,500);
        frame.setResizable(false);

        frame.setVisible(true);
        windowsClose(frame);



    }
    private static void windowsClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionListener implements ActionListener {
    private final int  buttonNumber;

    public MyActionListener(int number) {
        this.buttonNumber = number;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print(buttonNumber+ " ");

    }


}