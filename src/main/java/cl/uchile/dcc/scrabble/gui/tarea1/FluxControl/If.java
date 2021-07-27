package cl.uchile.dcc.scrabble.gui.tarea1.FluxControl;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.*;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Tree.Tree;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.*;

import java.util.ArrayList;

public class If {
    private Bool condition;
    private ArrayList <Tree> consecuences;

    public If(Tree condition, Tree trueCond, Tree falseCond) {
        try {
            Bool BCondition= (Bool) condition.eval().getInfo();
            this.condition= BCondition;
            consecuences.add(0, falseCond);
            consecuences.add(1, trueCond);
        }
        catch (Exception e) {
            System.out.println("Condicion invalida, revise su codigo e intente de nuevo");
            this.condition= null;
            consecuences.add(null);
            consecuences.add(null);
        }
    }

    public Nodo eval() {
        try {
            int intCondition= this.condition.getintvalue();
            try {
                return consecuences.get(intCondition).eval();
            }
            catch (Exception e) {
                return null;
            }
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de evaluar un If, revise su codigo e intente " +
                    "de nuevo");
            return null;
        }
    }
}
