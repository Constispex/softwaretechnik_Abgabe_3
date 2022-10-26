package de.st.io;

/**
 * Class for checking and saving given Program-Arguments.
 */
public class Arguments {
    public final int _number;
    public final String _filename;

    private Arguments(int number, String filename){
        _number = number;
        _filename = filename;
    }

    /**
     * Fabricates a new Instance of Arguments when the following conditions are met:
     * At least one Argument is given and that argument is parsable as an Integer.
     * If there is a second arguments the filename-property is going to be whatever that argument is
     * if not the filename is going to be 'new_document'.
     * @param args Arguments in form of Strings
     * @return Instance of Arguments (containing a number and a filename)
     */
    public static Arguments from(String... args){
        if(args.length >= 1 ){
            return new Arguments(
                    Integer.parseInt(args[0]),
                    args.length > 1 ? args[1] : "new_document"
            );
        }
        throw new IllegalArgumentException("Couldn't set the arguments.");
    }
}
