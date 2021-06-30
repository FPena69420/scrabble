package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;

import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;


public abstract class Nodo {
    private Object info;

    public Nodo(Object info) {
        this.info= info;
    }

    public Object getInfo(){
        return this.info;
    }

    public abstract Nodo eval();
}
