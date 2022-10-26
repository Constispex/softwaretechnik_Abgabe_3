package de.st.logic;

import java.util.List;

/**
 * Class that provides special methods for turning ? into Strings.
 */
public class SimpleListStringifier{
    /**
     * Turns any {@link List} into a String via adding the {@link Object#toString()} results of every
     * Listelement to oneanother divided by a space.
     */
    public static <T> String stringify(List<T> list){
        StringBuilder sB = new StringBuilder();
        for(T elem : list){
            sB.append(elem.toString());
            sB.append(' ');
        }
        return sB.deleteCharAt(sB.length()-1).toString();
    }

}
