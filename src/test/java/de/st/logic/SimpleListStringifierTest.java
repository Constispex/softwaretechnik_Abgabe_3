package de.st.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleListStringifierTest {
    List<Integer> test;

    @BeforeEach
    void setUp() {
        test = new ArrayList<>();
    }

    @Test
    void stringify() {
        for(int i = -6; i < 9; i +=2) test.add(i);
        String expected = "-6 -4 -2 0 2 4 6 8";
        assertEquals(expected, SimpleListStringifier.stringify(test));
    }
}