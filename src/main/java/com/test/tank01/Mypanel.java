package com.test.tank01;

import javax.swing.*;
import java.awt.*;

public class Mypanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        g.drawImage(new ImageIcon(ClassLoader.getSystemResource("E1tankD.png").getPath()).getImage(), 100, 100, null);
    }
}
