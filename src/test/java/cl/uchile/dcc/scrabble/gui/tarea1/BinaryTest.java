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
    void length() {
        assertEquals(7, bin.length());
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
    void testHashCode() {
        Binary e= new Binary("0101111");
        int expected= e.hashCode();
        assertEquals(expected, bin.hashCode());
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
        Binary expected= new Binary("0101111");
        assertEquals(expected, bin.ttBinary());
    }

    @Test
    void ttString() {
        String expected= new String("0101111");
        assertEquals(expected, bin.ttString());
    }

    @Test
    void testToString() {
        assertEquals("0101111", bin.toString());
    }

    @Test
    void and() {
        Binary expected= new Binary("0101111");
        assertEquals(expected, bin.and(new Bool(true)));

        expected= new Binary("0000000");
        assertEquals(expected, bin.and(new Bool(false)));

        assertEquals(null, bin.and(bin2));
    }

    @Test
    void or() {
        Binary expected= new Binary("1111111");
        assertEquals(expected, bin.or(new Bool(true)));

        expected= new Binary("0101111");
        assertEquals(expected, bin.or(new Bool(false)));

        assertEquals(null, bin.or(bin2));
    }

    @Test
    void sum() {
        Binary three= new Binary("011");
        Binary fivepointfive= new Binary("0101.1");

        Binary expected= new Binary("01000.1");
        assertEquals(expected, fivepointfive.sum(three));

        Binary four= new Binary("0100");
        expected= new Binary("0111.0");
        assertEquals(expected, three.sum(four));

        Int Ifour= new Int(4);
    }
}