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

class NodoTtBoolTest {
    NodedValue NVB1;
    NodedValue NVTF1;
    NodedValue NVF1;
    NodedValue NVI1;
    NodedValue NVS1;
    NodedValue NVNULL;
    NodoTtBool NTTTF;
    Tree T1;

    @BeforeEach
    void setUp() {
        NVB1= new NodedValue(new Binary("0110.0"));
        NVTF1= new NodedValue(new Bool(true));
        NVF1= new NodedValue(new Float((float) 3.14));
        NVI1= new NodedValue(new Int(3));
        NVS1= new NodedValue(new String("Amog"));
        NVNULL= new NodedValue(null);
    }

    @Test
    void eval() {
        NTTTF= new NodoTtBool(NVB1);
        T1= new Tree(NTTTF);
        System.out.println(NTTTF.toString());
        assertEquals(NVNULL, T1.eval());

        NTTTF= new NodoTtBool(NVTF1);
        T1= new Tree(NTTTF);
        System.out.println(NTTTF.toString());
        assertEquals(NVTF1, T1.eval());

        T1= new Tree(new NodoTtBool(NVF1));
        System.out.println(T1.toString());
        assertEquals(NVNULL, T1.eval());

        T1= new Tree(new NodoTtBool(NVI1));
        System.out.println(T1.toString());
        assertEquals(NVNULL, T1.eval());

        T1= new Tree(new NodoTtBool(NVS1));
        System.out.println(T1.toString());
        assertEquals(NVNULL, T1.eval());
    }
}