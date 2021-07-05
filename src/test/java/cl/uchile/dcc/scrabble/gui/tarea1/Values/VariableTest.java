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
    }

    @Test
    void setFloat() {
        X1.setBinary("010");
        X2.setFloat((float) 10);
        Float expected= new Float((float) 20);
        assertEquals(expected, X1.mult(X2));
    }

    @Test
    void setInt() {
    }

    @Test
    void setString() {
    }

    @Test
    void sum() {
    }

    @Test
    void substract() {
    }

    @Test
    void mult() {
    }

    @Test
    void dived_by() {
    }

    @Test
    void and() {
    }

    @Test
    void or() {
    }

    @Test
    void negate() {
    }
}