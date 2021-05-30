package cl.uchile.dcc.scrabble.gui.tarea1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloatTest {
    Float f1;
    Float f2;

    @BeforeEach
    void setUp() {
        f1= new Float((float) 47.375);
        f2= new Float((float) -8.375);
    }

    @Test
    void getValue() {
    }

    @Test
    void ttBool() {
    }

    @Test
    void ttFloat() {
    }

    @Test
    void ttInt() {
    }

    @Test
    void ttBinary() {
        Binary expected= new Binary("0101111.011");
        assertEquals(expected, f1.ttBinary());

        expected= new Binary("11000.011");
        assertEquals(expected, f2.ttBinary());

        Binary f3= new Binary("0.0");
        expected= new Binary("0");
        assertNotEquals(expected, f3);

        Float f4= new Float((float) 0.0);
        assertEquals(expected, f4.ttBinary());

        expected= new Float((float) 256.125).ttBinary();
        Binary f5= new Float((float) 256.12500).ttBinary();
        assertEquals(expected, f5);
    }

    @Test
    void ttString() {
    }

    @Test
    void testToString() {
    }
}