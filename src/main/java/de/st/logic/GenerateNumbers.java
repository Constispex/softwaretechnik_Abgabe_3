package de.st.logic;

import java.util.ArrayList;
import java.util.List;

public abstract class GenerateNumbers<T> {
    protected List<T> _numbers = new ArrayList<>();


    protected void generateNumbers(int length){
    }

    /**
     * expands _numbers with factor n
     * @param factor expanded factor
     */
    protected void expandList(int factor) {

    }

    public void printList() {
        int count = 0;
        for (T t: _numbers) {
            System.out.printf("Index: %s\t Content: %s %n",count, t);
            count++;
        }
    }

    protected List<T> getList(){
        return _numbers;
    }
}