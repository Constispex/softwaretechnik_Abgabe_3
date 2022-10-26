package de.st.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link NumberGenerator} for generating only prime Numbers.
 */
public class PrimeGenerator implements NumberGenerator<Integer> {
    /**
     * Generates a {@link List} of the first n prime numbers.
     * This algorithm is using a sieve to determine the prime numbers so the biggest value for n is
     * {@link Integer#MAX_VALUE} divided by 177.
     * @param n amount of prime numbers that shall be in the list
     * @return {@link List<Integer>} of the first n prime numbers
     *
     * @throws IllegalArgumentException if n < 1 or n > Integer.MAX_VALUE/178
     */
    @Override
    public List<Integer> generateNumbers(int n) {
        if(n < 1) throw new IllegalArgumentException("n must be at least 1.");
        if(n > Integer.MAX_VALUE/178) throw new IllegalArgumentException("n must be less than Integer.MAX_VALUE/178.");
        //ArrayList<Integer> result = new ArrayList<>();
        int lengthToSieve = n * 177;
        //fill(result, lengthToSieve);
        return primeSieve(lengthToSieve).subList(0, n);
    }
    private List<Integer> primeSieve(int amount){
        boolean[] prime = new boolean[amount+1];
        for(int i=0;i<=amount;i++)
            prime[i] = true;

        for(int p = 2; p*p <=amount; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p])
            {
                // Update all multiples of p
                for(int i = p*p; i <= amount; i += p)
                    prime[i] = false;
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 2; i<amount; i++){
            if(prime[i]) result.add(i);
        }

        return result;
    }
}
