package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;


import java.util.Objects;

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
}

