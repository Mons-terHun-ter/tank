package com.test.tank01;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public static void main(String[] args) {
        new MyFrame();

    }

    public MyFrame() {
        Mypanel mp = new Mypanel();
        mp.setBackground(Color.BLACK);
        this.add(mp);
        this.addKeyListener(mp);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 750);
    }


}
