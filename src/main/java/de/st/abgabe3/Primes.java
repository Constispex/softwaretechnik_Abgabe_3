package de.st.abgabe3;

import java.util.ArrayList;
import java.util.List;

public class Primes {
    int numberOfPrimes;

    public Primes(int numberOfPrimes){
        this.numberOfPrimes = numberOfPrimes;
        List<Integer> primes = new ArrayList<>();
        fillList(primes, numberOfPrimes * 2);
        System.out.println(primes.get(0));
        while(primes.size() !=  numberOfPrimes){

        }
    }
    private List<Integer> runMultiple(List<Integer> primes, int runNumber){
        return primes;
    }

    private List<Integer> fillList(List<Integer> primes, int length){
        for (int i = 1; i < length; i++) {
            primes.add(i);
        }
        return primes;
    }
}
