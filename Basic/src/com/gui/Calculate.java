package com.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate {
    public static void main(String[] args) {
        new Calcultor();
    }
}
class Calcultor extends Frame {
    public Calcultor()  {
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        TextField t3 = new TextField(20);
        Button b1 = new Button("=");
        b1.addActionListener(new MyCalculatorListener(t1,t2,t3));
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
}
class MyCalculatorListener implements ActionListener{

    private TextField t1,t2,t3;

    public MyCalculatorListener(TextField t1,TextField t2,TextField t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        t3.setText(""+(n1 + n2));
        t1.setText("");
        t2.setText("");
    }
}