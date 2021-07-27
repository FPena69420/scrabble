package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodedValue;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Tree.Tree;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Binary;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Bool;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Float;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Int;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.String;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodoTtIntTest {
    NodedValue NVB1;
    NodedValue NVTF1;
    NodedValue NVF1;
    NodedValue NVI1;
    NodedValue NVS1;

    NodedValue NVNULL;

    NodoTtInt NTTI;
    Tree T1;

    @BeforeEach
    void setUp() {
        NVB1= new NodedValue(new Binary("0110"));
        NVTF1= new NodedValue(new Bool(true));
        NVF1= new NodedValue(new Float((float) 3.14));
        NVI1= new NodedValue(new Int(6));
        NVS1= new NodedValue(new String("Amog"));
        NVNULL= new NodedValue(null);
    }

    @Test
    void eval() {
        NTTI= new NodoTtInt(NVB1);
        T1= new Tree(NTTI);
        System.out.println(NTTI.toString());
        assertEquals(NVI1, T1.eval());

        NTTI= new NodoTtInt(NVTF1);
        T1= new Tree(NTTI);
        System.out.println(NTTI.toString());
        assertEquals(NVNULL, T1.eval());

        T1= new Tree(new NodoTtInt(NVF1));
        System.out.println(T1.toString());
        assertEquals(NVNULL, T1.eval());

        T1= new Tree(new NodoTtInt(NVI1));
        System.out.println(T1.toString());
        assertEquals(NVI1, T1.eval());

        T1= new Tree(new NodoTtInt(NVS1));
        System.out.println(T1.toString());
        assertEquals(NVNULL, T1.eval());
    }
}