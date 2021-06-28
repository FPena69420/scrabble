package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree;



public abstract class Nodo {
    private Object info;
    private Nodo izq;
    private Nodo der;

    public Nodo(Nodo izq, Object info, Nodo der) {
        this.izq= izq;
        this.info= info;
        this.der= der;
    }

    public Object getInfo(){
        return this.info;
    }

    public Nodo getIzq() {
        return this.izq;
    }

    public Nodo getDer() {
        return this.der;
    }

    public abstract double eval();
}
