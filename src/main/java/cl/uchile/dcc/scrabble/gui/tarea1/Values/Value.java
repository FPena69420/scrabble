package cl.uchile.dcc.scrabble.gui.tarea1.Values;


import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.OperationsInterface;

public abstract class Value {
    private Object value;

    public Value(Object value) {
        this.value = value;
    }

    public Object parseValue() {
        return value;
    }

    public abstract Value times(Value second);

    public abstract Value over(Value second);

    public abstract Value minus(Value second);

    public abstract Value plus(Value second);

}
