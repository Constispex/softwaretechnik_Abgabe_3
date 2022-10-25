package de.st.logic;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator implements NumberGenerator<Integer> {
    @Override
    public List<Integer> generateNumbers(int length) {
        if(length < 1) throw new IllegalArgumentException("The length argument must be at least 1.");
        //ArrayList<Integer> result = new ArrayList<>();
        int lengthToSieve = length * 177;
        //fill(result, lengthToSieve);
        return primeSieve((int) Math.min(lengthToSieve, Integer.MAX_VALUE-1)).subList(0, length);
    }
    private List<Integer> fill(List<Integer> toFill, int amount){
        if(toFill != null){
            toFill.clear();
            for(int i = 2; i < amount; i++){
                toFill.add(i);
            }
        }
        return toFill;
    }
    private void fillAndExpand(List<Integer> toExpand){
        if(toExpand != null){
            for(int i = (int) toExpand.get(toExpand.size()); i < Math.max(toExpand.size()*5/4, 5); i++){
                toExpand.add(i);
            }
        }
    }
    private List<Integer> primeSieve(int amount){
        boolean prime[] = new boolean[amount+1];
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
