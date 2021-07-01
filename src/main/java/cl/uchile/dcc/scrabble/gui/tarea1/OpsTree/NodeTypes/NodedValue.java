package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;

import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;

import java.util.Objects;


public class NodedValue extends Nodo {

    public NodedValue(Value info){
        super(info);
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
        if (obj instanceof NodedValue) {
            var o= (NodedValue) obj;
            return this.getInfo().equals(o.getInfo());
        }
        else{
            return false;
        }
    }

    @Override
    public Nodo eval() {
        return this;
    }
}
