package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Tree;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodedValue;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations.NodoMult;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations.NodoSuma;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations.NodoTtBinary;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Binary;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Float;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Int;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    NodedValue NVIZQ1;
    NodedValue NVDER2;
    NodedValue NVIZQ2;
    NodoMult NM1;
    NodoSuma NS1;
    Tree T1;
    NodoTtBinary NTTBNVIZQ2;

    @BeforeEach
    void SetUp() {
        NVIZQ1= new NodedValue(new Binary("010"));
        NVDER2= new NodedValue(new Int(2));
        NVIZQ2= new NodedValue(new Float((float) 3.5));
        NTTBNVIZQ2= new NodoTtBinary(NVIZQ2);
        NS1= new NodoSuma(NVIZQ2, NVDER2);
        NM1= new NodoMult(NVIZQ1, NS1);
        T1= new Tree(NM1);
    }

    @Test
    void eval() {
        NodedValue expected= new NodedValue(new Float((float) 11.0));
        assertEquals(expected, T1.eval());
    }

    @Test
    void print() {
        NVIZQ1= new NodedValue(new Binary("010"));
        NVDER2= new NodedValue(new Int(2));
        NVIZQ2= new NodedValue(new Float((float) 3.5));
        NTTBNVIZQ2= new NodoTtBinary(NVIZQ2);
        NS1= new NodoSuma(NTTBNVIZQ2, NVDER2);
        NM1= new NodoMult(NVIZQ1, NS1);
        T1= new Tree(NM1);
        T1.print();
    }
}