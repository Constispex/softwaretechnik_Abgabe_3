package de.st.app;

import de.st.io.NumberOutput;
import de.st.logic.Primes;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 *
 */
public class Program {
    private static int numberOfPrimes;
    private static String filename;

    /**
     * @param args uebergibt die Anzahl der Primzahlen und einen (optionalen) Dateinamen
     */
    public static void main(String[] args) {
        Primes p = new Primes();
        if (checkArguments(args)) {
            Path path = Path.of("src/textfiles/" + filename + ".txt");
            try {
                new NumberOutput(Files.newBufferedWriter(path, StandardOpenOption.CREATE_NEW)).writeInFile(p.generatePrimes(numberOfPrimes));
            } catch (FileAlreadyExistsException f) {
                System.err.println("File already exist");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("NOP: %S, Name: %s%n", numberOfPrimes, filename);
        } else {
            System.err.println("Wrong arguments were committed");
        }
    }

    /**
     * Checkt die Argumente (String-Array) auf Primzahlen (in Feld 1) und einen Dateinamen (in Feld 2)
     * Falls kein Dateiname gesetzt wurde, wird ein default name benutzt.
     * Per Short-Circuit Technik werden die jeweiligen Faktoren geprüft.
     *
     * @param args uebergibt die Anzahl der Primzahlen und einen (optionalen) Dateinamen
     * @return true, wenn die Argumente die Bedingungen erfüllen
     */
    public static boolean checkArguments(String[] args) {
        return (!isArgsOneEmpty(args) && isArgsOneNumber(args)) && (!isArgsTwoEmpty(args) || setDefaultName());
    }

    /**
     * Ueberprueft, ob das Feld 0 leer ist.
     *
     * @param args uebergibt die Anzahl der Primzahlen und einen (optionalen) Dateinamen
     * @return True, wenn args eine länge von 0 hat. (= leeres Array)
     */
    private static boolean isArgsOneEmpty(String[] args) {
        return args.length == 0;
    }

    /**
     * @param args uebergibt die Anzahl der Primzahlen und einen (optionalen) Dateinamen
     * @return true, wenn in den Args auf Feld 0 eine Zahl drin ist.
     */
    private static boolean isArgsOneNumber(String[] args) {
        try {
            numberOfPrimes = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Wenn ein Dateiname gesetzt wurde, wird dieser der Variable übergeben.
     *
     * @param args uebergibt die Anzahl der Primzahlen und einen (optionalen) Dateinamen
     * @return true, wenn das 2. Argument leer ist.
     */
    private static boolean isArgsTwoEmpty(String[] args) {
        if (args.length == 1) return true;
        filename = args[1];
        return false;
    }

    /**
     * setzt den Standard Dateinamen, wenn kein anderer gesetzt wurde.
     *
     * @return true
     */
    private static boolean setDefaultName() {
        filename = "new_document";
        return true;
    }
}
