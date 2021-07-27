package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;


import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.TypesInterface;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Bool;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Float;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;

public abstract class Nodo {
    private Object info;
    private int procedencia;

    public Nodo(Object info, int procedencia) {
        this.info= info;
        this.procedencia= procedencia;
    }

    public Object getInfo(){
        return this.info;
    }

    public int getProcedencia() {
        return this.procedencia;
    }

    public abstract Nodo eval();

    /**
    public NodedValue usefulCompareTo(Nodo other) {
        return new NodedValue((Bool) ((Value) this.eval().getInfo()).usefulCompareTo((Value) other.eval().getInfo()));
    }
     */
}
