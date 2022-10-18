package de.st.io;

public class InputChecks {

    public static boolean checkNumber(String arg){
        try{
            Integer.parseInt(arg);
        }catch(NumberFormatException nfe){
            System.exit(1);
        }
        return false;
    }

}
