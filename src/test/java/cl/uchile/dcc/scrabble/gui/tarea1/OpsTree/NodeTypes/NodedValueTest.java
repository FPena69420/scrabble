package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;

import cl.uchile.dcc.scrabble.gui.tarea1.Values.Binary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodedValueTest {
    Nodo testNode1;


    @BeforeEach
    void SetUp() {
        testNode1= new NodedValue(new Binary("010"));
    }

    @Test
    void equals() {
        Nodo expected= new NodedValue(new Binary("010"));
        if (expected== testNode1) {
            System.out.println("true");
        }

        Nodo Null= null;
        expected= null;
        if (expected== null) {
            System.out.println("true2");
        }
    }

}