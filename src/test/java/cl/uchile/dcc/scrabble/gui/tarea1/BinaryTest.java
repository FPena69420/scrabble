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
    void suma1(){
        Binary s1= bin.suma1();
        Int i1= new Int(48);
        Binary expected= i1.ttBinary();
        assertEquals(expected, s1);

        Binary s2= new Int(1).ttBinary();
        expected= new Int(2).ttBinary();
        assertEquals(expected, s2.suma1());

        Binary s3= new Int(3).ttBinary();
        expected= new Int(4).ttBinary();
        assertEquals(expected, s3.suma1());

        Binary cero= new Int(0).ttBinary();
        System.out.println(cero.toString());

        Binary minusfour= new Binary("1100");
        Binary minusthree= new Binary("101");
        assertEquals(minusthree, minusfour.suma1());

        Binary minusone= new Binary("11");
        assertEquals(cero, minusone.suma1());
    }

    @Test
    void ttBool() {
        assertEquals(null, bin.ttBool());
    }

    @Test
    void ttFloat() {
        Binary decimalbinary1= new Binary("11000.011");
        Float expected= new Float((float) -8.375);
        assertEquals(expected, decimalbinary1.ttFloat());
    }

    @Test
    void ttInt() {
        assertEquals(new Int(47), bin.ttInt());
        assertEquals(new Int(-5), bin2.ttInt());
        Binary minuscero= new Int(-0).ttBinary();
        assertEquals(new Int(0), minuscero.ttInt());
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