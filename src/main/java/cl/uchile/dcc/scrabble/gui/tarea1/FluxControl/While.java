package cl.uchile.dcc.scrabble.gui.tarea1.FluxControl;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.Nodo;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Tree.Tree;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Bool;

import java.util.ArrayList;

public class While {
    private Bool condition;
    private ArrayList <Tree> action;

    public While(Tree condition, Tree action) {
        try {
            Bool BCondition= (Bool) condition.eval().getInfo();
            this.condition= BCondition;
            this.action.add(action);
        }
        catch (Exception e) {}
        try {
            Bool BCondition= (Bool) condition.getRoot().getInfo();
            this.condition= BCondition;
            this.action.add(action);
        }
        catch (Exception e) {
            System.out.println("Condicion invalida, revise su codigo e intente de nuevo");
            System.out.println(e.getCause() + e.getMessage());
            this.condition= null;
            this.action= null;
        }
    }

    public Nodo eval() {
        try {
            Nodo result = null;
            for (int i= this.condition.getintvalue(); i== 0; i= this.condition.getintvalue()) {
                /** make sure this updates correctly*/
                result= action.get(0).eval();
            }
            return result;
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de evaluar un while, revise su codigo e intente " +
                    "de nuevo");
            return null;
        }
    }
}
