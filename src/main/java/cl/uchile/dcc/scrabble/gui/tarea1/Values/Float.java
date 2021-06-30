package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.*;
import static cl.uchile.dcc.scrabble.gui.tarea1.Values.NumericMethods.*;

import java.util.Objects;



public class Float extends Value implements TypesInterface, OperationsInterface {

    public Float (float value) {
        super(value);
    }

    public float getValue() {
        return (float) this.parseValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(Float.class, this.getValue());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Float) {
            var o= (Float) obj;
            return this.getValue()== o.getValue();
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
        return this;
    }

    @Override
    public Int ttInt() {
        return null;
    }

    @Override
    public Binary ttBinary() {
        Int Int;
        if (this.getValue()>= 0){
            Int = new Int((int) Math.floor((double) this.getValue()));
        }
        else{
            Int= new Int((int) Math.ceil((double) this.getValue()));
        }
        float decimal= Math.abs(this.getValue() % 1);
        return new Binary(Int.ttBinary().toString() + DecimalToBinary(decimal));
    }

    @Override
    public String ttString() {
        return new String(java.lang.String.valueOf(this.getValue()));
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(this.getValue());
    }


    @Override
    public OperationsInterface sum(OperationsInterface ops) {
        return ops.SumedByFloat(this);
    }

    @Override
    public OperationsInterface substract(OperationsInterface ops) {
        return ops.SubstractedByFloat(this);
    }

    @Override
    public OperationsInterface mult(OperationsInterface ops) {
        return ops.MultedByFloat(this);
    }

    @Override
    public OperationsInterface dived_by(OperationsInterface ops) {
        return ops.FloatDiv(this);
    }

    @Override
    public OperationsInterface SumedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() + this.getValue());
    }

    @Override
    public OperationsInterface SumedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() + this.getValue());
    }

    @Override
    public OperationsInterface SumedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Float((float) Iops.getValue() + this.getValue());
    }

    @Override
    public OperationsInterface SubstractedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() - this.getValue());
    }

    @Override
    public OperationsInterface SubstractedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() - this.getValue());
    }

    @Override
    public OperationsInterface SubstractedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Float((float) Iops.getValue() - this.getValue());
    }

    @Override
    public OperationsInterface MultedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() * this.getValue());
    }

    @Override
    public OperationsInterface MultedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() * this.getValue());
    }

    @Override
    public OperationsInterface MultedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Float((float) Iops.getValue() * this.getValue());
    }

    @Override
    public OperationsInterface BinaryDiv(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() / this.getValue());
    }

    @Override
    public OperationsInterface FloatDiv(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() / this.getValue());
    }

    @Override
    public OperationsInterface IntDiv(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Float((float) Iops.getValue() / this.getValue());
    }

    @Override
    public OperationsInterface SumedByString(OperationsInterface ops) {
        String Sops= (String) ops;
        return new String(Sops.toString() + java.lang.String.valueOf(this.getValue()));
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
