package de.st.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class OutputTest {
    Path path;

    @BeforeEach
    void setUp() {
        path = Path.of("src/testOut/file.txt");
    }

    @AfterEach
    void tearDown() throws IOException {
        if(Files.exists(path)) {
            Files.delete(path);
        }
    }

    @Test
    void printToFile_double() throws IOException {
        Output.printToFile("1231233", path);
        assertThrows(FileAlreadyExistsException.class, () -> Output.printToFile("1231233", path));
    }

    @Test
    void printToFile() throws IOException {
        Output.printToFile("1231233", path);
        Scanner scanner = new Scanner(path);
        assertTrue(scanner.hasNext());
        assertEquals("1231233", scanner.next());
    }

}