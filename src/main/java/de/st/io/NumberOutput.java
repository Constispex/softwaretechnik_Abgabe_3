package de.st.io;

import java.io.BufferedWriter;
import java.io.Writer;

public class NumberOutput extends BufferedWriter {
    private String _filename;

    public NumberOutput(Writer writer, String filename) {
        super(writer);
        _filename = filename;
    }



}
