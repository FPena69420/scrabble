package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodedValue;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.Nodo;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodoNegTest {
    Binary B1;
    Int I1;

    @BeforeEach
    void SetUp() {
        B1= new Binary("01010");
        I1= new Int(24);
    }

    @Test
    void eval() {
        NodoNeg NN1= new NodoNeg(new NodedValue(B1));
        NodedValue expected= new NodedValue(new Binary("10101"));
        assertEquals(expected, NN1.eval());


        NodoNeg NN2= new NodoNeg(new NodedValue(I1));
        NodedValue expected2= new NodedValue(null);
        assertNotEquals(expected2, NN2.eval());
    }
}