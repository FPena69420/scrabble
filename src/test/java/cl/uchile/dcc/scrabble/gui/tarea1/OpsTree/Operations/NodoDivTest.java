package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodedValue;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.Nodo;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodoBinario;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Binary;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Int;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodoDivTest {
    Nodo NVIZQ;
    Nodo NVDER;
    Nodo ND1;

    @BeforeEach
    void SetUp() {
        NVIZQ= new NodedValue(new Binary("010"));
        NVDER= new NodedValue(new Int(2));
        ND1= new NodoDiv(NVIZQ, NVDER);
    }

    @Test
    void eval() {
        Nodo expected= new NodedValue(new Binary("01.0"));
        assertEquals(expected, ND1.eval());
    }

    @Test
    void equals() {
        NodoBinario expected= new NodoDiv(new NodedValue(new Binary("010")), new NodedValue(new Int(2)));
        assertEquals(expected.hashCode(), ND1.hashCode());
        assertEquals(expected, ND1);
        assertEquals(expected.getInfo(), ND1.getInfo());
        assertEquals(expected.toString(), ND1.toString());
    }
}