package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;


import java.util.Objects;

public abstract class NodoUnario extends Nodo{
    private java.lang.String info;
    private Nodo hijo;

    public NodoUnario(java.lang.String info, int procedencia, Nodo hijo) {
        super(info, procedencia);
        this.hijo= hijo;
    }

    @Override
    public java.lang.String getInfo() {
        return (java.lang.String) super.getInfo();
    }

    public Nodo getHijo() {
        return this.hijo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NodoUnario.class, this.getInfo(), this.getHijo());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NodoUnario) {
            var o= (NodoUnario) obj;
            return this.getInfo().equals(o.getInfo()) &&
                    this.getHijo().getInfo().equals(o.getHijo().getInfo());
        }
        else{
            return false;
        }
    }

    public java.lang.String toString() {
        return this.getInfo() + this.getHijo().toString();
    }
}
