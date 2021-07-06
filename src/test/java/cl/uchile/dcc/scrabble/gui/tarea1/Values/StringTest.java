package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import cl.uchile.dcc.scrabble.gui.tarea1.Values.*;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Float;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.String;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTest {
    String S1;
    String S2;
    Bool TF1;
    Binary B1;
    Float F1;
    Int I1;
    String expected;

    @BeforeEach
    void setUp() {
        S1= new String("John Salchichon");
        S2= new String("Amogus Impostor");
        TF1= new Bool(false);
        B1= new Binary("01000");
        F1= new Float((float) 32.5);
        I1= new Int(28);
    }

    @Test
    void testHashCode() {
        String e= new String("John Salchichon");
        int expected= e.hashCode();
        assertEquals(expected, S1.hashCode());
    }

    @Test
    void testEquals() {
        String e= new String("John Salchichon");
        assertEquals(true, e.equals(S1));
    }

    @Test
    void ttBool() {
        assertEquals(null, S1.ttBool());
    }

    @Test
    void ttFloat() {
        assertEquals(null, S1.ttFloat());
    }

    @Test
    void ttInt() {
        assertEquals(null, S1.ttInt());
    }

    @Test
    void ttBinary() {
        assertEquals(null, S1.ttBinary());
    }

    @Test
    void ttString() {
        String expected= new String("John Salchichon");
        assertEquals(expected, S1.ttString());

        java.lang.String unexpected= "John Salchichon";
        assertNotEquals(unexpected, S1.ttString());

        String unexpected2= new String("Arifureta season 2 baby!!!");
        assertNotEquals(unexpected2, S1.ttString());
    }

    @Test
    void testToString() {
        java.lang.String expected= "John Salchichon";
        assertEquals(expected, S1.toString());

        java.lang.String unexpected= "Amogus Impostor";
        int expected2= unexpected.length();
        assertEquals(expected2, S1.toString().length());
    }

    @Test
    void sum() {
        expected= new String("John Salchichonfalse");
        assertEquals(expected, S1.sum(TF1));

        expected= new String("John Salchichon01000");
        assertEquals(expected, S1.sum(B1));

        expected= new String("John Salchichon32.5");
        assertEquals(expected, S1.sum(F1));

        expected= new String("John Salchichon28");
        assertEquals(expected, S1.sum(I1));

        expected= new String("John SalchichonAmogus Impostor");
        assertEquals(expected, S1.sum(S2));
    }

    @Test
    void minus() {
        assertEquals(null, S1.substract(F1));
    }

    @Test
    void mult() {
        assertEquals(null, S1.mult(B1));
    }

    @Test
    void dived_by() {
        assertEquals(null, S1.dived_by(I1));
    }

    @Test
    void operations() {
        assertEquals(null, S1.substract(B1));
        assertEquals(null, S1.mult(B1));
        assertEquals(null, S1.dived_by(B1));

        assertEquals(null, B1.sum(S1));
        assertEquals(null, B1.substract(S1));
        assertEquals(null, B1.mult(S1));
        assertEquals(null, B1.dived_by(S1));

        assertEquals(null, S1.substract(TF1));
        assertEquals(null, S1.mult(TF1));
        assertEquals(null, S1.dived_by(TF1));

        assertEquals(null, TF1.sum(S1));
        assertEquals(null, TF1.substract(S1));
        assertEquals(null, TF1.mult(S1));
        assertEquals(null, TF1.dived_by(S1));

        assertEquals(null, S1.substract(F1));
        assertEquals(null, S1.mult(F1));
        assertEquals(null, S1.dived_by(F1));

        assertEquals(null, F1.sum(S1));
        assertEquals(null, F1.substract(S1));
        assertEquals(null, F1.mult(S1));
        assertEquals(null, F1.dived_by(S1));

        assertEquals(null, S1.substract(I1));
        assertEquals(null, S1.mult(I1));
        assertEquals(null, S1.dived_by(I1));

        assertEquals(null, I1.sum(S1));
        assertEquals(null, I1.substract(S1));
        assertEquals(null, I1.mult(S1));
        assertEquals(null, I1.dived_by(S1));

        assertEquals(null, S1.substract(S1));
        assertEquals(null, S1.mult(S1));
        assertEquals(null, S1.dived_by(S1));
    }

    @Test
    void print() {
        System.out.println(S1.getPrint());
    }
}