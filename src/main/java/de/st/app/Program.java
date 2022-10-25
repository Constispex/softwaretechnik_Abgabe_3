package de.st.app;

import de.st.io.Arguments;
import de.st.io.Output;
import de.st.logic.SimpleListStringifier;
import de.st.logic.PrimeGenerator;
import de.st.logic.NumberGenerator;

import java.io.IOException;
import java.nio.file.Path;

public class Program {

    public static void main(String[] args) throws IOException {
        Arguments arg = Arguments.from(args);
        NumberGenerator<Integer> gP = new PrimeGenerator();
        Output.printToFile(SimpleListStringifier.stringify(gP.generateNumbers(arg._number)), Path.of("src/out/" + arg._filename + ".txt"));
    }
}
