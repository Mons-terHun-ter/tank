package com.test.commonenum;

import lombok.Data;

/**
 * @author libo.a
 * @date 2021/11/23 6:56 下午
 */
public enum Direction {
    UP('U'),
    DOWN('D'),
    LEFT('L'),
    RIGHT('R');

    private char code;

    Direction(char code) {
        this.code = code;
    }

    public char getCode() {
        return code;
    }
}
