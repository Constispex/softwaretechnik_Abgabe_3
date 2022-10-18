package de.st.app;

import de.st.io.Arguments;
import de.st.io.ListWriter;
import de.st.logic.Primes;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Program {

    public static void main(String[] args) {
        Arguments arg = Arguments.from(args);
        Primes p = new Primes();
        System.out.println(p.generatePrimes(arg._number));
        System.out.println(arg._filename);

        try{
            BufferedWriter bwr = Files.newBufferedWriter(Path.of("src/" + arg._filename + ".txt"));
            ListWriter lwr = new ListWriter(bwr);
            lwr.write(p.generatePrimes(arg._number));
            lwr.close();
            bwr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
