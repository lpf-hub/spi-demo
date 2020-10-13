package com.changhong.spi.impl;

import com.changhong.Person;

public class Girl implements Person {

    @Override
    public void info() {
        System.out.println("Girl");
    }
}
