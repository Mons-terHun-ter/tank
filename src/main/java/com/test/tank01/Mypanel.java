package com.test.tank01;

import com.test.commonenum.Direction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Mypanel extends JPanel implements KeyListener {
    private Hero hero = new Hero(10, 10);

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        hero.draw(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                hero.move(Direction.LEFT);
                break;
            case KeyEvent.VK_S:
                hero.move(Direction.DOWN);
                break;
            case KeyEvent.VK_D:
                hero.move(Direction.RIGHT);
                break;
            case KeyEvent.VK_W:
                hero.move(Direction.UP);
                break;
            default:
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
