package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import cl.uchile.dcc.scrabble.gui.tarea1.Values.Binary;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Float;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Int;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.String;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloatTest {
    Float f1;
    Float f2;
    Float expected;
    Float one;
    Float two;
    Float three;
    Float eigthpoint375;

    @BeforeEach
    void setUp() {
        f1= new Float((float) 47.375);
        f2= new Float((float) -8.375);
        one= new Float((float) 1);
        two= new Float((float) 2);
        three= new Float((float) 3);
        eigthpoint375= new Float((float) 8.375);
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

        Binary expected2= new Binary("01.0");
        assertEquals(expected2, one.ttBinary());
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

    @Test
    void sum() {
        Binary Bone= new Binary("01");
        Float F1= new Float((float) 1);
        expected= new Float((float) 2);
        assertEquals(expected, F1.sum(Bone));

        Int I1= new Int(1);
        assertEquals(expected, F1.sum(I1));

        assertEquals(three, one.sum(two));
    }

    @Test
    void minus() {
        Binary Bone= new Binary("01");
        expected= new Float((float) 1);
        assertEquals(expected, two.substract(Bone));

        Int I1= new Int(1);
        assertEquals(expected, two.substract(I1));

        assertEquals(one, two.substract(one));
    }

    @Test
    void mult() {
        Binary Bthree= new Binary("011");
        expected= new Float((float) 3);
        assertEquals(expected, one.mult(Bthree));

        Int I3= new Int(3);
        assertEquals(expected, one.mult(I3));

        assertEquals(two, two.mult(one));
    }

    @Test
    void dived_by() {
        Binary Bthree= new Binary("011");
        expected= new Float((float) 1);
        assertEquals(expected, three.dived_by(Bthree));

        Int I3= new Int(3);
        assertEquals(expected, three.dived_by(I3));

        Float mone= new Float((float) -1);
        assertEquals(eigthpoint375, f2.dived_by(mone));
    }
}