package com.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestField {
    public static void main(String[] args) {
        new Myfield();
    }

}

class Myfield extends Frame{
    public Myfield(){
        TextField textField = new TextField();
        add(textField);
        MyActionListener2 myActionListener2 = new MyActionListener2();
        textField.addActionListener(myActionListener2);
        setVisible(true);
        pack();
        textField.setEchoChar('*');



    }

}
class  MyActionListener2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        e.getSource();
        System.out.println(e.getActionCommand());
    }
}