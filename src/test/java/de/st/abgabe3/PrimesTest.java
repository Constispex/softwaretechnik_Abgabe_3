package de.st.abgabe3;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class PrimesTest {

    @org.junit.jupiter.api.Test
    void generatePrimes() {
        Primes p = new Primes();
        assertThrows(RuntimeException.class, () ->  p.generatePrimes(-15));


    }



    @org.junit.jupiter.api.Test
    void generateNumbers() {
    }
}