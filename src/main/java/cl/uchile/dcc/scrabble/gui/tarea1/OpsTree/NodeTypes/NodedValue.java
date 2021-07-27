package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;

import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;

import java.util.Objects;


public class NodedValue extends Nodo {

    public NodedValue(Value info){
        super(info, 1);
    }


    @Override
    public Value getInfo() {
        return (Value) super.getInfo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(NodedValue.class, this.getInfo());
    }

    @Override
    public boolean equals(Object obj) {
        try {
            if (obj instanceof NodedValue) {
                var o= (NodedValue) obj;
                return ((this.getInfo()==null && o.getInfo()== null) || this.getInfo().equals(o.getInfo()));
            }
            else{
                return false;
            }
        }
        catch (Exception e){
            System.out.println("Hubo un error al tratar de comparar, revise su codigo e intente de nuevo.");
        }
        return false;
    }

    @Override
    /** Evalua el nodo */
    public Nodo eval() {
        return this;
    }

    @Override
    public java.lang.String toString() {
        if (this.getInfo()!= null) {
            return this.getInfo().getPrint();
        }
        else {
            return "null";
        }
    }
}
