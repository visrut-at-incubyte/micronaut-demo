package com.football;

import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Value;

@Factory
public class Math {
    @Value("${football.teamName}")
    String teamName;

    public int add(int a, int b) {
        System.out.println("-----------------------------------------------");
        System.out.println(teamName);
        System.out.println("-----------------------------------------------");
        return a + b;
    }
}