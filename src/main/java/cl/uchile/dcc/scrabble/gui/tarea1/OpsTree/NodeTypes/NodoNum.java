package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Nodo;



public class NodoNum extends Nodo {

    public NodoNum (int info){
        super(null, info, null);
    }

    @Override
    public double eval() {
        return (double) this.getInfo();
    }

}
