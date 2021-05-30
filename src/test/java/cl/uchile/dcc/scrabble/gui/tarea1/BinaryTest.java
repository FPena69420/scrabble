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