package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodedValue;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.Nodo;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodoUnario;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Tree.Tree;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Binary;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Bool;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Float;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Int;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.String;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodoTtBinaryTest {
    NodedValue NVB1;
    NodedValue NVTF1;
    NodedValue NVF1;
    NodedValue NVI1;
    NodedValue NVS1;

    NodedValue NVNULL;

    NodoTtBinary NTTS;
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
        NTTS= new NodoTtBinary(NVTF1);
        T1= new Tree(NTTS);
        System.out.println(NTTS.toString());
        assertEquals(NVNULL, T1.eval());

        NTTS= new NodoTtBinary(NVF1);
        T1= new Tree(NTTS);
        System.out.println(NTTS.toString());
        assertEquals(new NodedValue(new Binary("011.0010001111010111000011")), T1.eval());
    }

    @Test
    void various() {
        NodoUnario NU1 = new NodoTtBinary(NVF1);
        System.out.println(NU1.toString());
        System.out.println(NU1.getInfo());
        NodoUnario NU2= new NodoTtBinary(NVF1);
        assertEquals(NU1, NU2);
        assertEquals(NU1.hashCode(), NU2.hashCode());
    }
}