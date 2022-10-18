package de.st.app;

import de.st.io.Arguments;
import de.st.logic.Primes;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class Program {

    public static void main(String[] args) {
        Arguments arg = Arguments.from(args);
        Primes p = new Primes();
        System.out.println(p.generatePrimes(arg._number));
        System.out.println(arg._filename);

        try{
            BufferedWriter bwr = Files.newBufferedWriter(Path.of("src/out/" + arg._filename + ".txt"), StandardOpenOption.CREATE_NEW);
            bwr.write(String.valueOf(p.generatePrimes(arg._number)));
            bwr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
