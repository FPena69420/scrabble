package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.*;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;

public class NodoNeg extends NodoUnario {

    public NodoNeg (Nodo hijo) {
        super("¬", 1, hijo);
    }

    @Override
    public Nodo eval() {
        try {
            Value VHijo= (Value) this.getHijo().getInfo();
            return new NodedValue(VHijo.negate());
        }
        catch (Exception e) {
            System.out.println("Hubo un error tratando de negar, revise su codigo e intente de nuevo.");
        }
        return null;
    }
}
