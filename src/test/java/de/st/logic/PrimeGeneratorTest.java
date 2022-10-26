package de.st.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrimeGeneratorTest {
    PrimeGenerator pG;

    @BeforeEach
    void setUp() {
        pG = new PrimeGenerator();
    }

    @Test
    void generateNumbers_lowInput() {
        assertThrows(IllegalArgumentException.class, ()->pG.generateNumbers(0));
    }
    @Test
    void generateNumbers_highInput() {
        assertThrows(IllegalArgumentException.class,() -> pG.generateNumbers(Integer.MAX_VALUE));
    }
    @Test
    void generateNumbers_limit() {
        assertEquals(Integer.MAX_VALUE/178, pG.generateNumbers(Integer.MAX_VALUE/178).size());
    }
    @Test
    void generateNumbers(){
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        List<Integer> expected = new ArrayList<>();
        for(int i : arr) expected.add(i);
        assertEquals(expected, pG.generateNumbers(expected.size()));
    }
}