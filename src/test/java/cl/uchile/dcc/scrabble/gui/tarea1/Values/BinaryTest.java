package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import cl.uchile.dcc.scrabble.gui.tarea1.Values.*;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Float;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.String;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    Binary bin;
    Binary bin2;

    Binary one;
    Binary two;
    Binary three;
    Binary four;
    Binary five;
    Binary six;
    Binary seven;
    Binary eight;
    Binary nine;
    Binary ten;

    @BeforeEach
    void SetUp(){
        bin= new Binary("0101111");
        bin2= new Binary("1011");

        one= new Binary("01.0");
        two= new Binary("010.0");
        three= new Binary("011.0");
        four= new Binary("0100.0");
        five= new Binary("0101.0");
        six= new Binary("0110.0");
        seven= new Binary("0111.0");
        eight= new Binary("01000.0");
        nine= new Binary("01001.0");
        ten= new Binary("01010.0");

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
    void testEquals() {
        Binary expected= new Binary("01000.0");
        assertEquals(expected, eight);
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

        assertNotEquals(new Int(1), one.ttInt());
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
        Binary fivepointfive= new Binary("0101.1");

        Binary expected= new Binary("01000.1");
        assertEquals(expected, fivepointfive.sum(three));

        expected= new Binary("0111.0");
        assertEquals(expected, three.sum(four));

        Int Ifour= new Int(4);
        assertEquals(eight, four.sum(Ifour));

        Float F7= new Float(7);
        Float expected2= new Float((float) 10);
        assertEquals(expected2, three.sum(F7));
    }

    @Test
    void minus() {
        Binary expected= new Binary("010.0");
        assertEquals(expected, six.substract(four));

        Int Imfour= new Int(-4);
        Binary m2= new Binary("110");
        assertEquals(expected, m2.substract(Imfour));

        Float expected2= new Float((float) 6);
        Float F3= new Float((float) 3);
        assertEquals(expected2, nine.substract(F3));
    }

    @Test
    void mult() {
        Binary threepoint125= new Binary("011.001");
        Binary expected= new Binary("0110.01");

        assertEquals(expected, threepoint125.mult(two));

        Binary m3point125= new Binary("101.001");
        expected= new Binary("1010.01");
        assertEquals(expected, m3point125.mult(two));

        Int Im3= new Int(-3);
        expected= new Float((float) -6).ttBinary();
        assertEquals(expected, two.mult(Im3));

        Float Fm3= new Float((float) -3);
        Float expected2= new Float((float) -6);
        assertEquals(expected2, two.mult(Fm3));
    }

    @Test
    void dived_by() {
        Binary m6= new Binary("1010");
        Binary expected= new Binary("110.0");
        assertEquals(expected, m6.dived_by(three));

        Int I3= new Int(3);
        assertEquals(three, nine.dived_by(I3));

        Float F3= new Float((float) 3);
        Float expected2= new Float((float) 3);
        assertEquals(expected2, nine.dived_by(F3));
    }

    @Test
    void getPrint() {
        assertEquals("B|011.0", three.getPrint());
    }

    @Test
    void negate() {
        assertEquals(three.flip(), three.negate());
    }
}