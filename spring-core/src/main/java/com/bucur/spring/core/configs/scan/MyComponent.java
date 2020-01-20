package com.bucur.spring.core.configs.scan;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public MyComponent() {
        System.out.println("in my component");
    }

    public void complexOperation() {
        System.out.println("complex stuff...");
    }
}
