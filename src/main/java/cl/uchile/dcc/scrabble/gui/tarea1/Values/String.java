package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.*;

import java.util.Objects;



public class String extends Value implements TypesInterface, OperationsInterface {

    public String(java.lang.String value){
        super(value);
    }

    public java.lang.String getValue() {
        return (java.lang.String) this.parseValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(String.class, this.getValue());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String) {
            var o= (String) obj;
            return this.getValue().equals(o.getValue());
        }
        else{
            return false;
        }
    }

    @Override
    public Bool ttBool() {
        return null;
    }

    @Override
    public Float ttFloat() {
        return null;
    }

    @Override
    public Int ttInt() {
        return null;
    }

    @Override
    public Binary ttBinary() {
        return null;
    }

    @Override
    public String ttString() {
        return this;
    }

    @Override
    public java.lang.String toString() {
        return this.getValue();
    }


    @Override
    public OperationsInterface sum(OperationsInterface ops) {
        return ops.SumedByString(this);
    }

    @Override
    public OperationsInterface substract(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface mult(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface dived_by(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface SumedByBinary(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface SumedByFloat(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface SumedByInt(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface SubstractedByBinary(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface SubstractedByFloat(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface SubstractedByInt(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface MultedByBinary(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface MultedByFloat(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface MultedByInt(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface BinaryDiv(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface FloatDiv(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface IntDiv(OperationsInterface ops) {
        return null;
    }

    @Override
    public OperationsInterface SumedByString(OperationsInterface ops) {
        String Sops= (String) ops;
        return new String(Sops.toString() + this.toString());
    }

    @Override
    public Value times(Value second){
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            System.out.println("cast passed");
            return (Value) this.mult(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar estos valores");
        }
        return null;
    }

    @Override
    public Value over(Value second) {
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            System.out.println("cast passed");
            return (Value) this.dived_by(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar estos valores");
        }
        return null;
    }

    @Override
    public Value minus(Value second) {
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            System.out.println("cast passed");
            return (Value) this.substract(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar estos valores");
        }
        return null;
    }

    @Override
    public Value plus(Value second) {
        try{
            OperationsInterface OpsSecond= (OperationsInterface) second;
            System.out.println("cast passed");
            return (Value) this.sum(OpsSecond);
        }
        catch (Exception e) {
            System.out.println("Hubo un error al tratar de sumar estos valores");
        }
        return null;
    }
}
