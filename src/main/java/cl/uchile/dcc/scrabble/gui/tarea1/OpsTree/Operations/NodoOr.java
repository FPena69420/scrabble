package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.LogicTheGathering;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodedValue;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.Nodo;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodoBinario;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;

public class NodoOr extends NodoBinario {

    public NodoOr (Nodo izq, Nodo der) {
        super(izq, "or", 1, der);
    }

    @Override
    public Nodo eval() {
        try {
            LogicTheGathering IzqEval= (LogicTheGathering) getIzq().eval().getInfo();
            LogicTheGathering DerEval= (LogicTheGathering) getDer().eval().getInfo();
            return new NodedValue((Value) IzqEval.or(DerEval));
        }
        catch (Exception e) {
            System.out.println("Hubo un error tratando de usar or()");
        }
        return null;
    }
}
