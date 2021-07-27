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

class NodoTtStringTest {
    NodedValue NVB1;
    NodedValue NVTF1;
    NodedValue NVF1;
    NodedValue NVI1;
    NodedValue NVS1;

    NodedValue NVNULL;

    NodoTtString NTTS;
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
        NTTS= new NodoTtString(NVB1);
        T1= new Tree(NTTS);
        System.out.println(NTTS.toString());
        assertEquals(new NodedValue(new String("0110")), T1.eval());

        NTTS= new NodoTtString(NVI1);
        T1= new Tree(NTTS);
        System.out.println(NTTS.toString());
        assertEquals(new NodedValue(new String("6")), T1.eval());
    }
}