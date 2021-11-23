package com.test.tank01;

import lombok.Data;


@Data
public class Hero extends Tank {

    private Integer speed = 10;
    private static final String IMAGE_PREFIX = "E1tank{0}.png";

    public Hero(Integer x, Integer y) {
        super(x, y, IMAGE_PREFIX);
    }

}
