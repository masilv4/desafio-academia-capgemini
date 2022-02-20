package com.capgemini;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prob01Test {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void printATriangleWithSixUnitsOfSides() {
        Prob01.printTriangle(6);

        String newLine = System.lineSeparator();
        String triangle =
                "     *" + newLine +
                        "    **" + newLine +
                        "   ***" + newLine +
                        "  ****" + newLine +
                        " *****" + newLine +
                        "******";

        assertEquals(triangle, outputStreamCaptor.toString());
    }
}
