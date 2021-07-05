package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.Operations;

import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.TypesInterface;
import cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes.*;

public class NodoTtFloat extends NodoUnario {

    public NodoTtFloat (Nodo hijo) {
        super("ttFloat", 1, hijo);
    }

    @Override
    public Nodo eval() {
        try {
            TypesInterface VHijo= (TypesInterface) this.getHijo().getInfo();
            return new NodedValue(VHijo.ttFloat());
        }
        catch (Exception e) {
            System.out.println("Hubo un error tratando de transformar " +
                    "a Float, revise su codigo e intente de nuevo.");
        }
        return null;
    }

    @Override
    public String toString() {
        return "(" + this.getHijo().toString() + ")->F";
    }
}
