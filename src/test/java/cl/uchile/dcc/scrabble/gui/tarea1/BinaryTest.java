package cl.uchile.dcc.scrabble.gui.tarea1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    Binary bin;

    @BeforeEach
    void SetUp(){
        bin= new Binary("0101111");
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