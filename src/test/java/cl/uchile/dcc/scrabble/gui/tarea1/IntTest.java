package cl.uchile.dcc.scrabble.gui.tarea1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntTest {
    Int a1;

    @BeforeEach
    void setUp() {
        a1= new Int(47);
    }

    @Test
    void getval() {
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
        Binary expected= new Binary("0101111");
        Binary a1bin= a1.ttBinary();
        assertEquals(expected, a1bin);

        Binary cero= new Binary("0");
        Int ceroint= new Int(0);
        assertEquals(cero, ceroint.ttBinary());
    }

    @Test
    void ttString() {
    }

    @Test
    void testToString() {
    }
}