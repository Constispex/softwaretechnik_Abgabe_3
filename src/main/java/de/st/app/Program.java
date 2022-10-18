package de.st.app;

import de.st.logic.Primes;





public class Program {

    public static void main(String[] args) {
        Primes p = new Primes();
        System.out.println(p.generatePrimes(15));
        p.printList();

    }
    public static boolean checkArguments(String[] args){
        System.out.println("Debug_Arguments: " + args[0]);
        return true;
    }
}
