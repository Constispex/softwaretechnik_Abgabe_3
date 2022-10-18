package de.st.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class ListWriter extends BufferedWriter {
    Writer _writer;

    public ListWriter(Writer writer) {
        super(writer);
        _writer = writer;
    }




    public <T> void write(List<T> list) throws IOException {
        for (T elem : list) {
            _writer.write(elem.toString());
            _writer.write(' ');
        }
    }
}
