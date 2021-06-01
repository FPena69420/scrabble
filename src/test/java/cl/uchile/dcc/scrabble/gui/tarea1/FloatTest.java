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
    void testHashCode() {
        int h1= f1.hashCode();
        int expected= new Float((float) 47.375).hashCode();
        assertEquals(expected, h1);
    }

    @Test
    void getValue() {
        float expected= (float) 47.375;
        assertEquals(expected, f1.getValue());
    }

    @Test
    void ttBool() {
        assertEquals(null, f1.ttBool());
    }

    @Test
    void ttFloat() {
        float expected= (float) 47.375;
        assertEquals(new Float(expected), f1.ttFloat());
    }

    @Test
    void ttInt() {
        assertEquals(null, f1.ttInt());
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
        assertEquals(f3, f4.ttBinary());

        expected= new Float((float) 256.125).ttBinary();
        Binary f5= new Float((float) 256.12500).ttBinary();
        assertEquals(expected, f5);
    }

    @Test
    void ttString() {
        String expected= new String("47.375");
        assertEquals(expected, f1.ttString());

        expected= new String("-8.375");
        assertEquals(expected, f2.ttString());
    }

    @Test
    void testToString() {
        assertEquals("47.375", f1.toString());
        assertEquals("-8.375", f2.toString());
    }
}