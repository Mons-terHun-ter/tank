package com.test.tank01;

import com.test.commonenum.Direction;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.text.MessageFormat;

@Data
public abstract class Tank {
    private String imagePrefix = "E1tank{0}.png";
    private Integer x = 10;
    private Integer y = 10;
    private Direction direction = Direction.UP;
    private Integer speed = 1;

    public void draw(Graphics g) {
        g.drawImage(new ImageIcon(ClassLoader.getSystemResource(MessageFormat.format(this.getImagePrefix(), direction.getCode())).getPath()).getImage(), this.getX(), this.getY(), null);
    }

    public void move(Direction direction) {
        this.direction = direction;
        switch (direction) {
            case UP:
                y = y - this.getSpeed();
                break;
            case DOWN:
                y = y + this.getSpeed();
                break;
            case LEFT:
                x = x - this.getSpeed();
                break;
            case RIGHT:
                x = x + this.getSpeed();
                break;
            default:
        }
    }


}
