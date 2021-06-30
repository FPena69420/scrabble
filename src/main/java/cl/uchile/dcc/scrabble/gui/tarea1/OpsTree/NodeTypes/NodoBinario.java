package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;


public abstract class NodoBinario extends Nodo {
    private Nodo izq;
    private Nodo der;

    public NodoBinario(Nodo izq, java.lang.String info, Nodo der) {
        super(info);
        this.izq= izq;
        this.der= der;
    }

    @Override
    public java.lang.String getInfo() {
        return (java.lang.String) super.getInfo();
    }

    public Nodo getIzq() {
        return this.izq;
    }

    public Nodo getDer() {
        return this.der;
    }
}

