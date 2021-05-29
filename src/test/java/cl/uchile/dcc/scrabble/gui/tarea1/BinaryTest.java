package cl.uchile.dcc.scrabble.gui.tarea1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    Binary bin;
    Binary bin2;

    @BeforeEach
    void SetUp(){
        bin= new Binary("0101111");
        bin2= new Binary("1011");

    }

    @Test
    void flip() {
        Binary binflip= bin.flip();
        Binary expected= new Binary("1010000");
        Binary notexpected= new Binary("0101111");
        assertEquals(expected, binflip);
        assertNotEquals(notexpected, binflip);
    }

    @Test
    void nExtend(){
        Binary e1= bin.nExtend(2);
        Binary expected= new Binary("0101111");
        assertEquals(expected, e1);
        Binary e2= bin.nExtend(10);
        expected= new Binary("0000101111");
        assertEquals(expected, e2);

        expected= new Binary("11111011");
        Binary e3= bin2.nExtend(8);
        assertEquals(expected, e3);
    }

    @Test
    void sum() {

    }

    @Test
    void suma() {
        java.lang.String bit1= "1";
        java.lang.String bit2= "0";
        acarreo suma1= new acarreo(1, false);
        acarreo suma2= new acarreo(0, false);
        acarreo suma3= new acarreo(0, true);
        assertEquals(suma1, Binary.suma(bit1, bit2));
        assertEquals(suma2, Binary.suma(bit2, bit2));
        assertEquals(suma3, Binary.suma(bit1, bit1));
    }

    @Test
    void ttBool() {
        assertEquals(null, bin.ttBool());
    }

    @Test
    void ttFloat() {
    }

    @Test
    void ttInt() {
    }

    @Test
    void ttBinary() {
    }

    @Test
    void ttString() {
    }

    @Test
    void testToString() {
    }
}