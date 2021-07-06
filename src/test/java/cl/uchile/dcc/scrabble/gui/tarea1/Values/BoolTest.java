package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import cl.uchile.dcc.scrabble.gui.tarea1.Values.*;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Float;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.String;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoolTest {
    Bool B1;
    Bool B2;
    String S1;
    Bool TF1;
    Float F1;
    Int I1;
    Binary Binary1;
    String expected;

    @BeforeEach
    void setUp() {
        B1= new Bool(true);
        B2= new Bool(false);
        S1= new String("John Salchichon");
        TF1= new Bool(false);
        F1= new Float((float) 32.5);
        I1= new Int(28);
        Binary1= new Binary("0110.0");
    }

    @Test
    void testEquals() {
        Bool e= new Bool(true);
        assertEquals(true, e.equals(B1));
    }

    @Test
    void testHashCode() {
        Bool e= new Bool(true);
        int expected= e.hashCode();
        Bool e2= new Bool(false);
        int expected2= e2.hashCode();
        assertEquals(expected, B1.hashCode());
        assertEquals(expected2, B2.hashCode());
    }

    @Test
    void ttBool() {
        Bool expected= new Bool(true);
        assertEquals(expected, B1.ttBool());
        Bool expected2= new Bool(false);
        assertEquals(expected2, B2.ttBool());
    }

    @Test
    void ttFloat() {
        assertEquals(null, B1.ttFloat());
    }

    @Test
    void ttInt() {
        assertEquals(null, B2.ttInt());
    }

    @Test
    void ttBinary() {
        assertEquals(null, B2.ttBinary());
    }

    @Test
    void ttString() {
        String expected= new String("true");
        assertEquals(expected, B1.ttString());

        expected= new String("false");
        assertEquals(expected, B2.ttString());
    }

    @Test
    void testToString() {
        java.lang.String expected= "true";
        assertEquals(expected, B1.toString());

        expected= "false";
        assertEquals(expected, B2.toString());
    }

    @Test
    void and() {
        Binary seven= new Binary("0111.0");
        Binary expected= new Binary("0111.0");
        assertEquals(expected, B1.and(seven));

        assertEquals(B2, B1.and(B2));

        assertEquals(B1, B1.and(B1));

        assertEquals(B2, B2.and(B2));
    }

    @Test
    void or() {
        Binary seven= new Binary("0111.0");
        Binary expected= new Binary("1111.1");
        assertEquals(expected, B1.or(seven));

        assertEquals(B1, B1.or(B2));

        assertEquals(B1, B1.or(B1));

        assertEquals(B2, B2.or(B2));
    }

    @Test
    void operations() {
        assertEquals(null, B1.sum(Binary1));
        assertEquals(null, B1.substract(Binary1));
        assertEquals(null, B1.mult(Binary1));
        assertEquals(null, B1.dived_by(Binary1));

        assertEquals(null, Binary1.sum(B1));
        assertEquals(null, Binary1.substract(B1));
        assertEquals(null, Binary1.mult(B1));
        assertEquals(null, Binary1.dived_by(B1));

        assertEquals(null, B1.sum(TF1));
        assertEquals(null, B1.substract(TF1));
        assertEquals(null, B1.mult(TF1));
        assertEquals(null, B1.dived_by(TF1));

        assertEquals(null, TF1.sum(B1));
        assertEquals(null, TF1.substract(B1));
        assertEquals(null, TF1.mult(B1));
        assertEquals(null, TF1.dived_by(B1));

        assertEquals(null, B1.sum(F1));
        assertEquals(null, B1.substract(F1));
        assertEquals(null, B1.mult(F1));
        assertEquals(null, B1.dived_by(F1));

        assertEquals(null, F1.sum(B1));
        assertEquals(null, F1.substract(B1));
        assertEquals(null, F1.mult(B1));
        assertEquals(null, F1.dived_by(B1));

        assertEquals(null, B1.sum(I1));
        assertEquals(null, B1.substract(I1));
        assertEquals(null, B1.mult(I1));
        assertEquals(null, B1.dived_by(I1));

        assertEquals(null, I1.sum(B1));
        assertEquals(null, I1.substract(B1));
        assertEquals(null, I1.mult(B1));
        assertEquals(null, I1.dived_by(B1));

        assertEquals(null, B1.sum(S1));
        assertEquals(null, B1.substract(S1));
        assertEquals(null, B1.mult(S1));
        assertEquals(null, B1.dived_by(S1));


        assertEquals(null, S1.substract(B1));
        assertEquals(null, S1.mult(B1));
        assertEquals(null, S1.dived_by(B1));
        String expected= new String("John Salchichontrue");
    }

    @Test
    void negate() {
        assertEquals(TF1.flip(), TF1.negate());
    }

    @Test
    void print() {
        System.out.println(B1.getPrint());
    }
}