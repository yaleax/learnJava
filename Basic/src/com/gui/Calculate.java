package com.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate {
    public static void main(String[] args) {
        new Calcultor().loadFrame();
    }
}
class Calcultor extends Frame {
    //属性
    TextField t1,t2,t3;
    //方法
    public void loadFrame(){
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(20);
        Button b1 = new Button("=");
        b1.addActionListener(new MyCalculatorListener());
        Label l1 = new Label("+");
        setLayout(new FlowLayout());

        add(t1);
        add(l1);
        add(t2);
        add(b1);
        add(t3);
        pack();
        setVisible(true);

    }
    class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(""+(n1 + n2));
            t1.setText("");
            t2.setText("");
        }
    }
}
