package com.football;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
        Math math = new Math();
        math.add(1, 3);
    }
}