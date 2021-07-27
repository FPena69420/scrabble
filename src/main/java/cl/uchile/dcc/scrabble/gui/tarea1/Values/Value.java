package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.OperationsInterface;
import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.TypesInterface;

public abstract class Value implements Comparable<Value> {
    private Object value;

    public Value(Object value) {
        this.value = value;
    }

    public Object parseValue() {
        return value;
    }

    void setValue(Object aValue) {
        this.value= aValue;
    }

    public abstract java.lang.String getPrint();

    public abstract OperationsInterface sum(OperationsInterface ops);

    public abstract OperationsInterface substract(OperationsInterface ops);

    public abstract OperationsInterface mult(OperationsInterface ops);

    public abstract OperationsInterface dived_by(OperationsInterface ops);


    public Value times(Value second){
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            return (Value) this.mult(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de multiplicar, revise su codigo e intente de nuevo");
        }
        return null;
    }

    public Value over(Value second) {
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            return (Value) this.dived_by(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de dividir, revise su codigo e intente de nuevo");
        }
        return null;
    }

    public Value minus(Value second) {
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            return (Value) this.substract(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de restar, revise su codigo e intente de nuevo");
        }
        return null;
    }

    public Value plus(Value second) {
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            return (Value) this.sum(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar, revise su codigo e intente de nuevo");
        }
        return null;
    }

    public Value negate(){
        return null;
    }
    
    @Override
    public int compareTo(Value other) {
        try {
            TypesInterface NumOther= (TypesInterface) other;
            Float FOther= NumOther.ttFloat();
            float fOther= FOther.getValue();
            TypesInterface NumThis= (TypesInterface) this;
            Float FThis= NumThis.ttFloat();
            float fThis= FThis.getValue();

            if (fThis> fOther) {
                return 1;
            }
            else if (fThis== fOther) {
                return 0;
            }
            else {
                return -1;
            }
        }
        catch (Exception e) {
            System.out.println("Hubo un error tratando de comparar, revise su codigo e intente de nuevo");
            return 7;
        }
    }

    /**
    public Bool usefulCompareTo(Value other) {
        try {
            TypesInterface NumOther= (TypesInterface) other;
            Float FOther= NumOther.ttFloat();
            TypesInterface NumThis= (TypesInterface) this;
            Float FThis= NumThis.ttFloat();

            if (FThis.equals(FOther)) {
                return new Bool(true);
            }
            else {
                return new Bool(false);
            }
        }
        catch (Exception e) {
            System.out.println("Hubo un error tratando de comparar, revise su codigo e intente de nuevo");
            return new Bool(false);
        }
    }
     */
}
