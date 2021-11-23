package com.test.tank01;

import lombok.Data;

@Data
public class Hero extends Tank {

    private Integer speed = 10;

    public Hero(Integer x,Integer y) {
        this.setX(x);
        this.setY(y);
    }

}
