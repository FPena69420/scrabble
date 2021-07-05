package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.*;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;


public class NodoDiv extends NodoBinario {

    public NodoDiv (Nodo izq, Nodo der) {
        super(izq, "/", 1, der);
    }

    @Override
    public Nodo eval() {
        try {
            Value IzqEval= (Value) getIzq().eval().getInfo();
            Value DerEval= (Value) getDer().eval().getInfo();
            return new NodedValue(IzqEval.over(DerEval));
        }
        catch (Exception e) {
            System.out.println("Hubo un error tratando de dividir");
        }
        return null;
    }
}