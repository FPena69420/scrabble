package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.*;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodoMultTest {
    NodedValue NVDER;
    NodedValue NVIZQ;
    NodoMult NM1;
    NodoMult NM2;

    @BeforeEach
    void SetUp() {
        NVIZQ= new NodedValue(new Binary("010"));
        NVDER= new NodedValue(new Int(2));
        NM1= new NodoMult(NVIZQ, NVDER);
    }

    @Test
    void eval() {
        NodedValue expected= new NodedValue(new Binary("0100.0"));
        assertEquals(expected, NM1.eval());
        assertEquals(expected.hashCode(), NM1.eval().hashCode());
        assertEquals(expected.toString(), NM1.eval().toString());

        NodedValue NVNULL= new NodedValue(null);
        NM2= new NodoMult(NVIZQ, NVNULL);
        assertNotEquals(NVNULL, NM2.eval());
        assertEquals(NVNULL.getInfo(), NM2.eval().getInfo());
    }

    @Test
    void equals() {
        NodoBinario expected= new NodoMult(new NodedValue(new Binary("010")), new NodedValue(new Int(2)));
        assertEquals(expected.hashCode(), NM1.hashCode());
        assertEquals(expected, NM1);
        assertEquals(expected.getInfo(), NM1.getInfo());
        assertEquals(expected.toString(), NM1.toString());
    }
}