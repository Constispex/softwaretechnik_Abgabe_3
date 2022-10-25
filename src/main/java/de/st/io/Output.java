package de.st.io;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Output {
    public static void printToFile(String element, Path path) throws IOException {
        BufferedWriter bwr = Files.newBufferedWriter(path, StandardOpenOption.CREATE_NEW);
        bwr.write(element);
        bwr.close();
    }
}
