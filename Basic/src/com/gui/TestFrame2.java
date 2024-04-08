package com.gui;

import javax.swing.*;
import java.awt.*;

public class TestFrame2 {

    public static void main(String[] args) {
        MyFrame  myFrame1 = new MyFrame(200,200,400,400,Color.cyan);
        MyFrame  myFrame2 = new MyFrame(600,200,400,400,Color.blue);
        MyFrame  myFrame3 = new MyFrame(200,600,400,400,Color.white);
        MyFrame  myFrame4 = new MyFrame(600,600,400,400,Color.yellow);


    }

}


class MyFrame extends Frame{
    static int id = 0;

    public MyFrame(int x,int y,int w,int h,Color color)  {
        super("Myframe" + id++);
        setVisible(true);
        setBounds(x,y,w,h);
        setBackground(color);
        setResizable(false);
    }
}
