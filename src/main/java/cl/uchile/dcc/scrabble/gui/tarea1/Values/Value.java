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
            System.out.println("Hubo un error al tratar de multiplicar");
        }
        return null;
    }

    public Value over(Value second) {
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            return (Value) this.dived_by(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de dividir");
        }
        return null;
    }

    public Value minus(Value second) {
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            return (Value) this.substract(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de restar");
        }
        return null;
    }

    public Value plus(Value second) {
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            return (Value) this.sum(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar");
        }
        return null;
    }
}
