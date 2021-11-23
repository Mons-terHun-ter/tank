package com.test.tank01;

import com.test.commonenum.Direction;
import lombok.Data;
import java.awt.*;

@Data
public abstract class Tank {
    private String imagePrefix;
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
