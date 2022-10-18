package de.st.io;

@FunctionalInterface
public interface ParameterCheck<T> {

    boolean check(T parameter);

}
