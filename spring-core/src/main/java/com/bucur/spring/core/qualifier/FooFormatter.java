package com.bucur.spring.core.qualifier;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter implements Formatter {

    @Override
    public String format() {
        System.out.println("foo");
        return "foo";
    }
}
