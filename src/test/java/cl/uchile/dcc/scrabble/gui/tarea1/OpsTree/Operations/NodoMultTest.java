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

        NodedValue NVNULL= new NodedValue(null);
        NM2= new NodoMult(NVIZQ, NVNULL);
        assertNotEquals(NVNULL, NM2.eval());
        assertEquals(NVNULL.getInfo(), NM2.eval().getInfo());
    }
}