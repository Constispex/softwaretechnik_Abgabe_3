package de.st.logic;

import java.util.List;

/**
 * Interface for generating a List of Numbers with a specific length.
 * @param <Number>
 */
@FunctionalInterface
public interface NumberGenerator<Number> {
    List<Number> generateNumbers(int length);
}
