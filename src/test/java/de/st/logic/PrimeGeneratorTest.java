package de.st.logic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeGeneratorTest {
    PrimeGenerator pG;

    @BeforeEach
    void setUp() {
        pG = new PrimeGenerator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void generateNumbers_lowInput() {
        assertThrows(IllegalArgumentException.class, ()->pG.generateNumbers(0));
    }
    @Test
    void generateNumbers_highInput() {
        pG.generateNumbers(Integer.MAX_VALUE);
    }
    @Test
    void generateNumbers_output() {

    }
}