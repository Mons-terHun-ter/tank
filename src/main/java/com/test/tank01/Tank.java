package com.test.tank01;

import com.test.commonenum.Direction;
import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.text.MessageFormat;

@Data
public abstract class Tank {
    private Integer x = 10;
    private Integer y = 10;
    private Direction direction = Direction.UP;
    private Integer speed = 1;
    Image upImage;
    Image downImage;
    Image leftImage;
    Image rightImage;
    Image currentImage = upImage;

    public void draw(Graphics g) {
        g.drawImage(this.getCurrentImage(), this.getX(), this.getY(), null);
    }

    public Tank(Integer x, Integer y, String imagePrefix) {
        this.setX(x);
        this.setY(y);
        this.upImage = new ImageIcon(ClassLoader.getSystemResource(MessageFormat.format(imagePrefix, Direction.UP.getCode())).getPath()).getImage();
        this.downImage = new ImageIcon(ClassLoader.getSystemResource(MessageFormat.format(imagePrefix, Direction.DOWN.getCode())).getPath()).getImage();
        this.leftImage = new ImageIcon(ClassLoader.getSystemResource(MessageFormat.format(imagePrefix, Direction.LEFT.getCode())).getPath()).getImage();
        this.rightImage = new ImageIcon(ClassLoader.getSystemResource(MessageFormat.format(imagePrefix, Direction.RIGHT.getCode())).getPath()).getImage();
        this.setCurrentImage(upImage);
    }

    public void move(Direction direction) {
        this.direction = direction;
        switch (direction) {
            case UP:
                y = y - this.getSpeed();
                currentImage = upImage;
                break;
            case DOWN:
                y = y + this.getSpeed();
                currentImage = downImage;
                break;
            case LEFT:
                x = x - this.getSpeed();
                currentImage = leftImage;
                break;
            case RIGHT:
                x = x + this.getSpeed();
                currentImage = rightImage;
                break;
            default:
        }
    }


}
