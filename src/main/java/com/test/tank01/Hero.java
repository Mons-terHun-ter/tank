package com.test.tank01;

import com.test.commonenum.Direction;
import lombok.Data;

import javax.swing.*;
import java.text.MessageFormat;

@Data
public class Hero extends Tank {

    private Integer speed = 10;
    private String imagePrefix = "E1tank{0}.png";

    public Hero(Integer x,Integer y) {
        this.setX(x);
        this.setY(y);
        this.upImage = new ImageIcon(ClassLoader.getSystemResource(MessageFormat.format(this.getImagePrefix(), Direction.UP.getCode())).getPath()).getImage();
        this.downImage = new ImageIcon(ClassLoader.getSystemResource(MessageFormat.format(this.getImagePrefix(), Direction.DOWN.getCode())).getPath()).getImage();
        this.leftImage = new ImageIcon(ClassLoader.getSystemResource(MessageFormat.format(this.getImagePrefix(), Direction.LEFT.getCode())).getPath()).getImage();
        this.rightImage = new ImageIcon(ClassLoader.getSystemResource(MessageFormat.format(this.getImagePrefix(), Direction.RIGHT.getCode())).getPath()).getImage();
        this.setCurrentImage(upImage);
    }

}
