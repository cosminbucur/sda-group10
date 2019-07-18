package com.bucur;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoTest {

//    @Test
//    public void someTest() {
//        assertThat(1).isEqualTo(1);
//    }

    @org.junit.jupiter.api.Test
    public void junit5Test() {
        assertThat(1).isEqualTo(1);
    }
}
