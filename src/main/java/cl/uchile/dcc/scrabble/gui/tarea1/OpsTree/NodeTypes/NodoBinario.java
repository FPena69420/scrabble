package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;


import java.util.Objects;

public abstract class NodoBinario extends Nodo {
    private Nodo izq;
    private Nodo der;

    public NodoBinario(Nodo izq, java.lang.String info, int procedencia, Nodo der) {
        super(info, procedencia);
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

    @Override
    public int hashCode() {
        return Objects.hash(NodoBinario.class, this.getInfo(), this.getIzq(), this.getDer());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NodoBinario) {
            var o= (NodoBinario) obj;
            return this.getInfo().equals(o.getInfo()) &&
                    this.getIzq().getInfo().equals(o.getIzq().getInfo()) &&
                    this.getDer().getInfo().equals(o.getDer().getInfo());
        }
        else{
            return false;
        }
    }

    public java.lang.String toString() {
        java.lang.String retIzq;
        java.lang.String retDer;

        if (this.getIzq().getProcedencia() < this.getProcedencia()) {
            retIzq= "(" + this.getIzq().toString() + ")";
        }
        else {
            retIzq= this.getIzq().toString();
        }

        if (this.getDer().getProcedencia() < this.getProcedencia()) {
            retDer= "(" + this.getDer().toString() + ")";
        }
        else {
            retDer= this.getDer().toString();
        }

        return retIzq + " " + this.getInfo() + " " + retDer;
    }
}

