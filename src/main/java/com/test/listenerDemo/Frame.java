package com.test.listenerDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author libo.a
 * @date 2021/11/23 5:48 下午
 */
public class Frame extends JFrame {
    public static void main(String[] args) {
        new Frame();
    }

    public Frame() {
        Panel panel = new Panel();
        this.add(panel);
        this.addKeyListener(panel);
        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Panel extends JPanel implements KeyListener {
    private int x = 10;
    private int y = 10;
    private int T = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(x, y, 30, 30);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                x = x - T;
                break;
            case KeyEvent.VK_S:
                y = y + T;
                break;
            case KeyEvent.VK_D:
                x = x + T;
                break;
            case KeyEvent.VK_W:
                y = y - T;
                break;
            default:
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
