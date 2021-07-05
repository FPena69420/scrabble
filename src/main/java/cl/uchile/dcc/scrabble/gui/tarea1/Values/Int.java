package cl.uchile.dcc.scrabble.gui.tarea1.Values;

import cl.uchile.dcc.scrabble.gui.tarea1.Interfaces.*;

import java.util.Objects;

import static cl.uchile.dcc.scrabble.gui.tarea1.Values.NumericMethods.*;

public class Int extends Value implements TypesInterface, OperationsInterface {

    public Int(int value){
        super(value);
    }

    public int getValue(){
        return (int) this.parseValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(Int.class, this.getValue());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Int) {
            var o= (Int) obj;
            return this.getValue()== o.getValue();
        }
        else {
            return false;
        }
    }

    @Override
    public Bool ttBool() {
        return null;
    }

    /* Chequear si funciona*/
    @Override
    public Float ttFloat() {
        return new Float((float) this.getValue());
    }

    @Override
    public Int ttInt() {
        return this;
    }

    @Override
    public Binary ttBinary() {
        if (this.getValue()>= 0) {
            return PosIntToBinary(this.getValue());
        }
        else {
            return NegIntToBinary(this.getValue());
        }
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
    public java.lang.String getPrint() {
        return "I|" + this.getValue();
    }

    @Override
    public OperationsInterface sum(OperationsInterface ops) {
        return ops.SumedByInt(this);
    }

    @Override
    public OperationsInterface substract(OperationsInterface ops) {
        return ops.SubstractedByInt(this);
    }

    @Override
    public OperationsInterface mult(OperationsInterface ops) {
        return ops.MultedByInt(this);
    }

    @Override
    public OperationsInterface dived_by(OperationsInterface ops) {
        return ops.IntDiv(this);
    }

    @Override
    public OperationsInterface SumedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() + (float) this.getValue()).ttBinary();
    }

    @Override
    public OperationsInterface SumedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() + (float) this.getValue());
    }

    @Override
    public OperationsInterface SumedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Int(Iops.getValue() + this.getValue());
    }

    @Override
    public OperationsInterface SubstractedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() - (float) this.getValue()).ttBinary();
    }

    @Override
    public OperationsInterface SubstractedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() - (float) this.getValue());
    }

    @Override
    public OperationsInterface SubstractedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Int(Iops.getValue() - this.getValue());
    }

    @Override
    public OperationsInterface MultedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() * (float) this.getValue()).ttBinary();
    }

    @Override
    public OperationsInterface MultedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() * (float) this.getValue());
    }

    @Override
    public OperationsInterface MultedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Int(Iops.getValue() * this.getValue());
    }

    @Override
    public OperationsInterface BinaryDiv(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() / (float) this.getValue()).ttBinary();
    }

    @Override
    public OperationsInterface FloatDiv(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() / (float) this.getValue());
    }

    @Override
    public OperationsInterface IntDiv(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Int(Iops.getValue() / this.getValue());
    }

    @Override
    public OperationsInterface SumedByString(OperationsInterface ops) {
        String Sops= (String) ops;
        return new String(Sops.toString() + this.getValue());
    }
}
