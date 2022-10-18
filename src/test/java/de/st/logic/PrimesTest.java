package de.st.logic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimesTest {

    @Test
    void generatePrimes() {
        int nop = 5;
        Primes p = new Primes();
        p.generatePrimes(nop);
        List<Integer> primeList = new ArrayList<>();
        primeList.add(2);
        primeList.add(3);
        primeList.add(5);
        primeList.add(7);
        primeList.add(11);

        assertEquals(primeList, p.getList());
    }

    @Test
    void catchPrimes() {
    }

    @Test
    void isPrime() {
    }

    @Test
    void generateNumbers() {
    }

    @Test
    void expandList() {
    }

    @BeforeEach
    void setUp() {
    }
}