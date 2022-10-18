package de.st.logic;

import java.util.List;
public interface NumberGenerator<T> {
    List<T> generateNumbers(int length);
}
