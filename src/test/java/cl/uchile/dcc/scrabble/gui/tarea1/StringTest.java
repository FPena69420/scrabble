package cl.uchile.dcc.scrabble.gui.tarea1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTest {
    String S1;

    @BeforeEach
    void setUp() {
        S1= new String("John Salchichon");
    }

    @Test
    void testHashCode() {
        String e= new String("John Salchichon");
        int expected= e.hashCode();
        assertEquals(expected, S1.hashCode());
    }

    @Test
    void testEquals() {
        String e= new String("John Salchichon");
        assertEquals(true, e.equals(S1));
    }

    @Test
    void ttBool() {
        assertEquals(null, S1.ttBool());
    }

    @Test
    void ttFloat() {
        assertEquals(null, S1.ttFloat());
    }

    @Test
    void ttInt() {
        assertEquals(null, S1.ttInt());
    }

    @Test
    void ttBinary() {
        assertEquals(null, S1.ttBinary());
    }

    @Test
    void ttString() {
        String expected= new String("John Salchichon");
        assertEquals(expected, S1.ttString());

        java.lang.String unexpected= "John Salchichon";
        assertNotEquals(unexpected, S1.ttString());

        String unexpected2= new String("Arifureta season 2 baby!!!");
        assertNotEquals(unexpected2, S1.ttString());
    }

    @Test
    void testToString() {
        java.lang.String expected= "John Salchichon";
        assertEquals(expected, S1.toString());

        java.lang.String unexpected= "Amogus Impostor";
        int expected2= unexpected.length();
        assertEquals(expected2, S1.toString().length());
    }
}