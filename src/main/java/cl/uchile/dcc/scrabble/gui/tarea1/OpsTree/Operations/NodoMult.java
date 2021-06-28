package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Nodo;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.NodoOp;



public class NodoMult extends NodoOp {

    public NodoMult (Nodo izq, Nodo der) {
        super(izq, "*", der);
    }

    @Override
    public double eval() {
        return this.getIzq().eval() * this.getDer().eval();
    }
}
