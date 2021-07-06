package cl.uchile.dcc.scrabble.gui.tarea1.ValueVault;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodedValue;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Binary;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Variable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueVaultTest {
    Binary two;
    Variable X1;
    ValueVault vault;

    @Test
    void intialize() {
        vault= new ValueVault();
        two= new Binary("010");
        vault.intialize(new Variable());
        Value NVTwo= vault.intialize(two);

        Value another= vault.intialize(two);

        assertEquals(another, NVTwo);
        vault.print();

        int BlankVar= vault.getCode(new Variable());
        assertEquals(-1, BlankVar);
    }

    @Test
    void getCode() {
        vault= new ValueVault();
        two= new Binary("010");
        System.out.println(vault.getCode(two));

        vault.intialize(two);
        System.out.println(vault.getCode(two));

        Value another= vault.getElementByCode(0);
        assertEquals(two, another);

        Value unreachable= vault.getElementByCode(-1);
        assertEquals(null, unreachable);
    }
}