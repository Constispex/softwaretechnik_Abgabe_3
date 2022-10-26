package de.st.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArgumentsTest {

    String[] args;

    @Test
    void from_nothing() {
        args = new String[4];
        assertThrows(NumberFormatException.class, () -> Arguments.from(args));
    }
    @Test
    void from_firstNotNumber(){
        args = new String[]{"abc", "cde", "fgh"};
        assertThrows(NumberFormatException.class, () -> Arguments.from(args));
    }
    @Test
    void from_firstButNotSecond(){
        args = new String[]{"1"};
        assertEquals(1, Arguments.from(args)._number);
        assertEquals("new_document", Arguments.from(args)._filename);
    }
    @Test
    void from_firstAndSecond(){
        args = new String[]{"1", "zzz"};
        assertEquals(1, Arguments.from(args)._number);
        assertEquals("zzz", Arguments.from(args)._filename);
    }
}