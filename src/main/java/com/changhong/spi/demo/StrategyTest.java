package com.changhong.spi.demo;

import com.changhong.spi.core.PersonFactory;

/**
 * @author lpf
 */
public class StrategyTest {
    public static void main(String[] args) {
        final PersonFactory factory = new PersonFactory();
        factory.invoker();
    }
}
