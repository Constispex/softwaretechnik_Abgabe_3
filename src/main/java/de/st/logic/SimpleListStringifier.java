package de.st.logic;

import java.util.List;

public class SimpleListStringifier{
    public static <T> String stringify(List<T> list){
        StringBuilder sB = new StringBuilder();
        for(T elem : list){
            sB.append(elem.toString());
            sB.append(' ');
        }
        return sB.deleteCharAt(sB.length()-1).toString();
    }

}
