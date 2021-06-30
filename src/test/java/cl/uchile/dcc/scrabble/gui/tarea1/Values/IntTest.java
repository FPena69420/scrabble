package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import cl.uchile.dcc.scrabble.gui.tarea1.Values.Binary;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Float;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Int;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.String;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntTest {
    Int a1;
    Int one;
    Int two;
    Int three;
    Int four;

    @BeforeEach
    void setUp() {
        a1= new Int(47);
        one= new Int(1);
        two= new Int(2);
        three= new Int(3);
        four= new Int(4);
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
        assertEquals(expected, a1.getValue());
    }

    @Test
    void testHashcode() {
        int expected= new Int(47).hashCode();
        assertEquals(expected, a1.hashCode());
    }

    @Test
    void getVal() {
        assertEquals(47, a1.getValue());
    }

    @Test
    void ttBool() {
        assertEquals(null, a1.ttBool());
    }

    @Test
    void ttFloat() {
        float fexpected= 47;
        Float expected= new Float(fexpected);
        assertEquals(expected, a1.ttFloat());
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
        String expected= new String("47");
        assertEquals(expected, a1.ttString());
    }

    @Test
    void testToString() {
        java.lang.String expected= "47";
        String notexpected= new String("47");
        assertEquals(expected, a1.toString());
        assertNotEquals(notexpected, a1.toString());
    }

    @Test
    void sum() {
        Binary Bone= new Binary("01");
        Binary expected= new Binary("010.0");
        assertEquals(expected, one.sum(Bone));

        Float F1= new Float((float) 1);
        Float expected2= new Float((float) 2);
        assertEquals(expected2, one.sum(F1));

        assertEquals(two, one.sum(one));
    }

    @Test
    void minus() {
        Binary Bone= new Binary("01");
        Binary expected= new Binary("010.0");
        assertEquals(expected, three.substract(Bone));

        Float F1= new Float((float) 1);
        Float expected2= new Float((float) 2);
        assertEquals(expected2, three.substract(F1));

        assertEquals(two, four.substract(two));
    }

    @Test
    void mult() {
        Binary Bone= new Binary("01");
        Binary expected= new Binary("010.0");
        assertEquals(expected, two.mult(Bone));

        Float F1= new Float((float) 1);
        Float expected2= new Float((float) 3);
        assertEquals(expected2, three.mult(F1));

        assertEquals(three, one.mult(three));
    }

    @Test
    void dived_by() {
        Binary Btwo= new Binary("010");
        Binary expected= new Binary("010.0");
        assertEquals(expected, four.dived_by(Btwo));

        Float F1= new Float((float) 1);
        Float expected2= new Float((float) 2);
        assertEquals(expected2, two.dived_by(F1));

        assertEquals(one, one.dived_by(one));
    }
}