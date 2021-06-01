package cl.uchile.dcc.scrabble.gui.tarea1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoolTest {
    Bool B1;
    Bool B2;

    @BeforeEach
    void setUp() {
        B1= new Bool(true);
        B2= new Bool(false);
    }

    @Test
    void testEquals() {
        Bool e= new Bool(true);
        assertEquals(true, e.equals(B1));
    }

    @Test
    void testHashCode() {
        Bool e= new Bool(true);
        int expected= e.hashCode();
        Bool e2= new Bool(false);
        int expected2= e2.hashCode();
        assertEquals(expected, B1.hashCode());
        assertEquals(expected2, B2.hashCode());
    }

    @Test
    void ttBool() {
        Bool expected= new Bool(true);
        assertEquals(expected, B1.ttBool());
        Bool expected2= new Bool(false);
        assertEquals(expected2, B2.ttBool());
    }

    @Test
    void ttFloat() {
        assertEquals(null, B1.ttFloat());
    }

    @Test
    void ttInt() {
        assertEquals(null, B2.ttInt());
    }

    @Test
    void ttBinary() {
        assertEquals(null, B2.ttBinary());
    }

    @Test
    void ttString() {
        String expected= new String("true");
        assertEquals(expected, B1.ttString());

        expected= new String("false");
        assertEquals(expected, B2.ttString());
    }

    @Test
    void testToString() {
        java.lang.String expected= "true";
        assertEquals(expected, B1.toString());

        expected= "false";
        assertEquals(expected, B2.toString());
    }
}