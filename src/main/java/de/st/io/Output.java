package de.st.io;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * The class provided methods to handle the Output of a program
 */
public class Output {
    /**
     * Writes a String into a specific Path if the file does not yet exist.
     * @param element String to write
     * @param path where to write
     * @throws IOException if there was a problem with creating or writing into the specified file
     */
    public static void printToFile(String element, Path path) throws IOException {
        BufferedWriter bwr = Files.newBufferedWriter(path, StandardOpenOption.CREATE_NEW);
        bwr.write(element);
        bwr.close();
    }
}
