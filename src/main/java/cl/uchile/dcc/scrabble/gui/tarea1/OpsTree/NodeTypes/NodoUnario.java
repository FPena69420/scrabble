package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;


public abstract class NodoUnario extends Nodo{
    private java.lang.String info;
    private Nodo hijo;

    public NodoUnario(java.lang.String info, Nodo hijo) {
        super(info);
        this.hijo= hijo;
    }

    @Override
    public java.lang.String getInfo() {
        return (java.lang.String) super.getInfo();
    }
}
