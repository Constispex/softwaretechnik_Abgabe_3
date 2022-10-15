package de.st.abgabe3;

import java.util.List;

public class Primes extends GenerateNumbers<Integer>{

    private int lastIndex;

    /**
     * Constructor sets lastIndex from _numbers to 0
     */
    public Primes(){
        lastIndex = 0;
    }

    /**
     * fills _number and creates list
     * expands list and catches prime numbers as long as prime list is smaller than numberOfPrimes
     * @param numberOfPrimes how much prime numbers do you need?
     * @throws RuntimeException if numberOfPrimes is negative -> Method throws RuntimeException
     */
    public void generatePrimes(int numberOfPrimes) throws RuntimeException{
        generateNumbers(numberOfPrimes);

        if (numberOfPrimes < 0) throw new RuntimeException("numberOfPrimes is negative");

        do {
            expandList(2);
        } while (catchPrimes(_numbers).size() < numberOfPrimes);
        _numbers = _numbers.subList(0, numberOfPrimes);
    }

    /**
     * Searches for Prime Numbers.
     * If prime number -> stays in List <br>
     * Not a prime number -> number wil be removed
     * @param integerList List with Numbers
     * @return List
     */
    public List<Integer> catchPrimes(List<Integer> integerList) {
        for (int i = 0; i < integerList.size() - 1; i++) {
            if (!isPrime(integerList.get(i))){
                integerList.remove(i);
                i--;
            }
        }
        return integerList;
    }

    /**
     * checks, if n is a prime number
     * @param n checked number
     * @return is prime number? -> True
     */
    public static boolean isPrime(Integer n) {
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
        for (int i = getLastIndex(); i < length; i++) {
            _numbers.add(i);
        }
    }

    @Override
    protected void expandList(int factor) {
        int newSize = _numbers.size() * factor;
        setLastIndex(newSize);
        generateNumbers(newSize * 2); // expands list
    }

    private void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    private int getLastIndex() {
        return lastIndex;
    }

}
