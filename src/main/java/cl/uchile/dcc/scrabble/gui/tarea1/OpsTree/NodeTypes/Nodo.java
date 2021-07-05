package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;


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
}
