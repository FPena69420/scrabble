package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueTest {
    Binary B1;
    Float F1;
    Int I1;


    @BeforeEach
    void SetUp() {
        I1= new Int(3);
        F1= new Float((float) 31.4);
        B1= new Binary("010");
    }

    @Test
    void parseValue() {
        float expected= (float) 33.4;
        assertEquals(expected, B1.plus(F1).parseValue());
    }

    @Test
    void times() {
        Value RES1= I1.times(B1);
        System.out.println(RES1.getClass());
        Value RES2= RES1.times(B1);
        System.out.println(RES2.getClass());
        Binary expected= new Binary("01100.0");
        assertEquals(expected, RES2);
    }

    @Test
    void negate() {
        Value X1= new Binary("0111001");
        Binary expected= new Binary("1000110");
        assertEquals(expected, X1.negate());
    }
}