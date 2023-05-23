package com.football;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class MathTest {

    @Test
    void add() {
        Math math = new Math();
        assertEquals(3, math.add(1, 2));
    }
}