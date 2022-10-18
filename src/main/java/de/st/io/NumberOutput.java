package de.st.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class NumberOutput extends BufferedWriter {
    public NumberOutput(Writer writer) {
        super(writer);
    }

    public void writeInFile(List<Integer> list) throws IOException {
        for (Integer i : list) {
            super.write((i) + " ");
        }
        super.close();
    }
}
