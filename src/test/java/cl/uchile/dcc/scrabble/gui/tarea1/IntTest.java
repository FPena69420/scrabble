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
    void testHashCode() {
        int hash1= a1.hashCode();
        int hash2= new Int(47).hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    void testEquals() {
        Int a2= new Int(48);
        Binary a3= new Binary("47");
        boolean expected= false;
        assertEquals(expected, a1.equals(a2));
        assertEquals(expected, a1.equals(a3));
    }

    @Test
    void getval() {
        int expected= 47;
        assertEquals(expected, a1.getval());
    }

    @Test
    void ttBool() {
        assertEquals(null, a1.ttBool());
    }

    @Test
    void ttFloat() {
        /*float fexpected= 47;
        Float expected= new Float(fexpected);
        assertEquals(expected, a1.ttFloat());
        need to override hashcode and equals on Float
         */
    }

    @Test
    void ttInt() {
        Int a2= new Int(47);
        assertEquals(a2, a1.ttInt());
    }

    @Test
    void ttBinary() {
        Binary expected= new Binary("0101111");
        Binary a1bin= a1.ttBinary();
        assertEquals(expected, a1bin);

        Binary cero= new Binary("0");
        Int ceroint= new Int(0);
        assertEquals(cero, ceroint.ttBinary());

        Binary minus8= new Int(-8).ttBinary();
        expected= new Binary("11000");
        assertEquals(expected, minus8);
        expected= new Binary("1001");
        assertEquals(expected, minus8.suma1());
    }

    @Test
    void ttString() {
        /*String expected= new String("47");
        assertEquals(expected, a1.ttString());
        need to override hashcode and equals in String */
    }

    @Test
    void testToString() {
        java.lang.String expected= "47";
        String notexpected= new String("47");
        assertEquals(expected, a1.toString());
        assertNotEquals(notexpected, a1.toString());
    }
}