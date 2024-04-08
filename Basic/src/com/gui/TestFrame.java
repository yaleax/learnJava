package com.gui;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("Mywindows");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLocation(200,200);
        frame.setBackground(new Color(140, 234, 78, 255));
        frame.setResizable(false);
    }



}
