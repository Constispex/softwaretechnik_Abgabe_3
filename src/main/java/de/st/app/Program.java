package de.st.app;

import de.st.io.InputChecks;
import de.st.io.NumberOutput;
import de.st.logic.Primes;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 *
 */
public class Program {

    /**
     * @param args uebergibt die Anzahl der Primzahlen und einen (optionalen) Dateinamen
     */
    public static void main(String[] args) {
        Primes p = new Primes();
        if (InputChecks.checkArguments(args)) {
            Path path = Path.of("src/textfiles/" + InputChecks.getFilename() + ".txt");
            try {
                List<Integer> primeList = p.generatePrimes(InputChecks.getNumberOfPrimes());
                new NumberOutput(Files.newBufferedWriter(path, StandardOpenOption.CREATE_NEW)).writeInFile(primeList);
            } catch (FileAlreadyExistsException f) {
                System.err.println("File already exist");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("NOP: %S, Name: %s%n", InputChecks.getNumberOfPrimes(), InputChecks.getFilename());
        } else {
            System.err.println("Wrong arguments were committed");
        }
    }

    /**
     * setzt den Standard Dateinamen, wenn kein anderer gesetzt wurde.
     * @return true
     */
    public static boolean setDefaultName() {
        InputChecks.setFilename("new_document");
        return true;
    }
}
