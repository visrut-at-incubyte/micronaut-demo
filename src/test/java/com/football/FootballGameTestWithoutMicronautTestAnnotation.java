package com.football;

import jakarta.inject.Inject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertNull;

class FootballGameTestWithoutMicronautTestAnnotation {
    @Inject
    FootballGame footballGame;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalSystemOut);
    }

    @Test
    void testLogTeamInfo() {

        footballGame.logTeamInfo();

        String[] lines = outputStream.toString().split(System.lineSeparator());
        assertNull(lines[1]);
        assertNull(lines[2]);
    }
}