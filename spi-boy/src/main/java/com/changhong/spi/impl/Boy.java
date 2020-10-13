package com.changhong.spi.impl;

import com.changhong.Person;

/**
 * @author lpf
 */
public class Boy implements Person {

    @Override
    public void info() {
        System.out.println("Boy");
    }
}
