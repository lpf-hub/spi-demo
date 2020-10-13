package com.changhong.spi.core;

import com.changhong.Person;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author lpf
 */
public class PersonFactory {
    public void invoker() {
        final ServiceLoader<Person> services = ServiceLoader.load(Person.class);
        final Iterator<Person> iterator = services.iterator();
        boolean notFound = true;
        while(iterator.hasNext()) {
            notFound = false;
            final Person person = iterator.next();
            person.info();
        }

        if (notFound) {
            System.out.println("未发现具体实现类");
        }
    }
}
