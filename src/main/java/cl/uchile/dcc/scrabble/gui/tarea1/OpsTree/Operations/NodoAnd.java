package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.LogicTheGathering;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodedValue;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.Nodo;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodoBinario;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;

public class NodoAnd extends NodoBinario {

    public NodoAnd (Nodo izq, Nodo der) {
        super(izq, "and", 1, der);
    }

    @Override
    public Nodo eval() {
        try {
            LogicTheGathering IzqEval= (LogicTheGathering) getIzq().eval().getInfo();
            LogicTheGathering DerEval= (LogicTheGathering) getDer().eval().getInfo();
            return new NodedValue((Value) IzqEval.and(DerEval));
        }
        catch (Exception e) {
            System.out.println("Hubo un error tratando de usar and()");
        }
        return null;
    }
}
