package de.st.io;

public class Arguments {
    public final int _number;
    public final String _filename;

    private Arguments(int number, String filename){
        _number = number;
        _filename = filename;
    }

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
