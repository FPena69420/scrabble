package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.Nodo;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodoBinario;

public class NodoOr extends NodoBinario {

    public NodoOr(Nodo izq, Nodo der) {
        super(izq, "or", 1, der);
    }

    @Override
    public Nodo eval() {
        return null;
    }
}
