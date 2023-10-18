package com.lovely4k.backend;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Sonar {

    @Test
    void test() {
        Assertions.assertThat("a").isEqualTo("a");
    }

    @Disabled
    @Test
    void test2() {
        Assertions.assertThat("a").isEqualTo("b");
    }
}