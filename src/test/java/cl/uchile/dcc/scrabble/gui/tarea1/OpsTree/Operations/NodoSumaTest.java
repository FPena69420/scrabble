package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodedValue;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.Nodo;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodoBinario;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Binary;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Int;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodoSumaTest {

    Nodo NVIZQ;
    Nodo NVDER;
    Nodo NS1;

    @BeforeEach
    void SetUp() {
        NVIZQ= new NodedValue(new Binary("010"));
        NVDER= new NodedValue(new Int(2));
        NS1= new NodoSuma(NVIZQ, NVDER);
    }

    @Test
    void eval() {
        Nodo expected= new NodedValue(new Binary("0100.0"));
        assertEquals(expected, NS1.eval());
    }

    @Test
    void equals() {
        NodoBinario expected= new NodoSuma(new NodedValue(new Binary("010")), new NodedValue(new Int(2)));
        assertEquals(expected.hashCode(), NS1.hashCode());
        assertEquals(expected, NS1);
        assertEquals(expected.getInfo(), NS1.getInfo());
        assertEquals(expected.toString(), NS1.toString());
    }
}