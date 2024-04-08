package com.gui;

import com.oop.Demo05.B;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestAction2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Start-Stop");
        Button startButton = new Button("Start");
        Button stopButton = new Button("Stop");
        stopButton.setActionCommand("stopButton");
        MyMonitor myMonitor = new MyMonitor();

        startButton.addActionListener(myMonitor);
        stopButton.addActionListener(myMonitor);

        frame.add(startButton, BorderLayout.NORTH);
        frame.add(stopButton,BorderLayout.SOUTH);
        frame.setBounds(200,200,500,500);
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

class MyMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了：msg " + e.getActionCommand());
    }
}
