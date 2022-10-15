package de.st.abgabe3;

import java.util.ArrayList;
import java.util.List;

public class PrimesOld extends GenerateNumbers<Integer>{
    List<Integer> primeList;

    public PrimesOld() {
        primeList = new ArrayList<>();
    }

    /**
     * geneartes a list with specific amount of prime numbers
     * @param numberOfPrimes is the amount of prime numbers
     * @return the List with prime numbers
     */
    public List<Integer> generatePrimes(int numberOfPrimes){
        generateNumbers(numberOfPrimes * 2);

        if (numberOfPrimes <= 0) throw new RuntimeException("Length is not positive");

        for (int i = 0; i < _numbers.size(); i++) {
            if (isPrime(_numbers.get(i))) { // is prime number
                primeList.add(i);
                 System.out.println("added: " + i);
                if (primeList.size() == numberOfPrimes) { // Task successful
                    System.out.println("Added all prime numbers to primeList successfully");
                    return primeList;
                }
            } // not a prime number:
            if (_numbers.size() - 1 == i) {
                expandList();
            }
        }
        System.err.println("An error occurred!");
        return null;
    }

    private void expandList() {
        int newSize = _numbers.size() * 2;
        _numbers.clear();
        generateNumbers(newSize); // expands list
    }

    /**
     * checks, if n is a prime number
     * @param n checked number
     * @return is prime number? -> True
     */
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void generateNumbers(int length) {
        for (int i = 0; i <= length; i++) {
            _numbers.add(i);
        }
    }
}