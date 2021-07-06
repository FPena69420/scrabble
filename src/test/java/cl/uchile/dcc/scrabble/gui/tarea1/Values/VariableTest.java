package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableTest {
    Variable X1;
    Variable X2;

    @BeforeEach
    void SetUp() {
        X1= new Variable();
        X2= new Variable();
    }

    @Test
    void setBinary() {
        X1.setBinary("011");
        X2.setBinary("0101");
        Binary expected= new Binary("01000.0");
        assertEquals(expected, X1.sum(X2));

        X1.setBinary("010");
        assertNotEquals(expected, X1.sum(X2));

        X2.setBinary("0100");
        expected= new Binary("01000.0");
        assertEquals(expected, X1.mult(X2));

        expected= new Binary("010.0");
        assertEquals(expected, X2.dived_by(X1));

        assertEquals(expected, X2.substract(X1));
    }

    @Test
    void setBool() {
        X1.setBool(true);
        Bool expected= new Bool(false);
        assertEquals(expected, X1.flip());

        X2.setBinary("0100");
        assertEquals(null, X1.sum(X2));
        assertEquals(null, X1.mult(X2));
        assertEquals(null, X1.dived_by(X2));
        assertEquals(null, X1.substract(X2));
    }

    @Test
    void setFloat() {
        X1.setBinary("010");
        X2.setFloat((float) 10);
        Float expected= new Float((float) 20);
        assertEquals(expected, X1.mult(X2));
        assertEquals(expected, X2.mult(X1));

        expected= new Float((float) 12);
        assertEquals(expected, X2.sum(X1));

        expected= new Float((float) 8);
        assertEquals(expected, X2.substract(X1));

        X2.setInt(2);
        Binary expected2= new Binary("0100.0");
        assertEquals(expected2, X1.mult(X2));

        expected2= new Binary("01.0");
        assertEquals(expected2, X2.dived_by(X1));

        expected= new Float((float) 1);
        X2.setFloat((float) 2);
        X1.setFloat((float) 2);
        assertEquals(expected, X1.dived_by(X2));

        X1.setBool(true);
        assertEquals(null, X1.sum(X2));
        assertEquals(null, X1.mult(X2));
        assertEquals(null, X1.dived_by(X2));
        assertEquals(null, X1.substract(X2));
    }

    @Test
    void setInt() {
        X1.setInt(3);
        X2.setInt(10);
        Int expected= new Int(13);
        assertEquals(expected, X2.sum(X1));

        expected= new Int(7);
        assertEquals(expected, X2.substract(X1));

        expected = new Int(30);
        assertEquals(expected, X1.mult(X2));
    }

    @Test
    void setString() {
        X1.setString("Junior");
        X2.setString("Dr.");
        assertEquals(new String("Dr.Junior"), X2.sum(X1));
    }

    @Test
    void and() {
        X1.setBool(true);
        X2.setBool(false);
        Bool expected= new Bool(false);
        assertEquals(expected, X1.and(X2));

        X1.setBinary("010001");
        X2.setBinary("0110110");
        assertEquals(null, X2.and(X1));
    }

    @Test
    void or() {
        X1.setBool(true);
        X2.setBool(false);
        Bool expected= new Bool(true);
        assertEquals(expected, X1.or(X2));

        X1.setBinary("011");
        X2.setBinary("0111.0");
        assertEquals(null, X1.or(X2));
    }

    @Test
    void negate() {
        X1.setBinary("010011");
        Binary expected= new Binary("101100");
        assertEquals(expected, X1.negate());

        X2.setFloat((float) 38);
        assertEquals(null, X2.negate());
    }

    @Test
    void print() {
        X1.setInt(3);
        X1.print();
    }

    @Test
    void times() {
        X1.setInt(3);
        X2.setInt(12);
        assertEquals(X1.mult(X2), X1.times(X2));
    }

    @Test
    void over() {
        X1.setBinary("0110");
        X2.setBinary("0111.0");
        assertEquals(X2.dived_by(X1), X2.over(X1));
    }

    @Test
    void plus() {
        X1.setInt(24);
        X2.setBinary("0110");
        assertEquals(X1.sum(X2), X1.plus(X2));
    }

    @Test
    void minus() {
        X1.setBinary("0110");
        X2.setFloat((float) 4.2);
        assertEquals(X1.substract(X2), X1.minus(X2));
    }

}