package de.st.io;

import de.st.app.Program;

public class InputChecks {
    static int numberOfPrimes;
    static String filename;

    /**
     * Checkt die Argumente (String-Array) auf Primzahlen (in Feld 1) und einen Dateinamen (in Feld 2)
     * Falls kein Dateiname gesetzt wurde, wird ein default name benutzt.
     * Per Short-Circuit Technik werden die jeweiligen Faktoren geprüft.
     * @param args uebergibt die Anzahl der Primzahlen und einen (optionalen) Dateinamen
     * @return true, wenn die Argumente die Bedingungen erfüllen
     */
    public static boolean checkArguments(String[] args) {
        return (!isArgsOneEmpty(args) && isArgsOneNumber(args)) && (!isArgsTwoEmpty(args) || Program.setDefaultName());
    }


    /**
     * Ueberprueft, ob das Feld 0 leer ist.
     * @param args uebergibt die Anzahl der Primzahlen und einen (optionalen) Dateinamen
     * @return True, wenn args eine länge von 0 hat. (= leeres Array)
     */
    private static boolean isArgsOneEmpty(String[] args) {
        return args.length == 0;
    }

    /**
     * @param args uebergibt die Anzahl der Primzahlen und einen (optionalen) Dateinamen
     * @return true, wenn in den Args auf Feld 0 eine Zahl drin ist.
     */
    private static boolean isArgsOneNumber(String[] args) {
        try {
            numberOfPrimes = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Wenn ein Dateiname gesetzt wurde, wird dieser der Variable übergeben.
     * @param args uebergibt die Anzahl der Primzahlen und einen (optionalen) Dateinamen
     * @return true, wenn das 2. Argument leer ist.
     */
    private static boolean isArgsTwoEmpty(String[] args) {
        if (args.length == 1) return true;
        filename = args[1];
        return false;
    }

    public static int getNumberOfPrimes(){
        return numberOfPrimes;
    }

    public static String getFilename() {
        return filename;
    }

    public static void setFilename(String filename) {
        InputChecks.filename = filename;
    }
}
