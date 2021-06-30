package cl.uchile.dcc.scrabble.gui.tarea1.OpsTree.NodeTypes;

import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.TypesInterface;
import cl.uchile.dcc.scrabble.gui.tarea1.Values.Value;


public class NodedValue extends Nodo {

    public NodedValue(Value info){
        super(info);
    }


    @Override
    public Object getInfo() {
        return (Value) super.getInfo();
    }

    @Override
    public Nodo eval() {
        return this;
    }
}
