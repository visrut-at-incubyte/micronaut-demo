package com.football;

import io.micronaut.context.annotation.Value;
import jakarta.inject.Inject;

public class FootballGame {

    private final String teamName;

    private final String teamSize;

    @Inject
    public FootballGame(@Value("${football.teamName}") String teamName, @Value("${football.teamSize}") String teamSize) {
        this.teamName = teamName;
        this.teamSize = teamSize;
    }


    public void logTeamInfo() {
        System.out.println("-----------------------------------------------");
        System.out.println(teamName);
        System.out.println(teamSize);
        System.out.println("-----------------------------------------------");
    }
}
