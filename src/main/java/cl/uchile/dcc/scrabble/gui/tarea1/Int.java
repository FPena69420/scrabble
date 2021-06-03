package cl.uchile.dcc.scrabble.gui.tarea1;

import java.util.Objects;

public class Int extends Num implements TypesInterface, OperationsInterface {
    int value;

    public Int(int value){
        this.value=value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Int.class, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Int) {
            var o= (Int) obj;
            return value== o.value;
        }
        else {
            return false;
        }
    }

    public int getval(){
        return this.value;
    }

    @Override
    public Bool ttBool() {
        return null;
    }

    /* Chequear si funciona*/
    @Override
    public Float ttFloat() {
        return new Float((float) this.value);
    }

    @Override
    public Int ttInt() {
        return this;
    }

    @Override
    public Binary ttBinary() {
        if (this.value>= 0) {
            return PosIntToBinary(this.value);
        }
        else {
            return NegIntToBinary(this.value);
        }
    }

    @Override
    public String ttString() {
        return new String(java.lang.String.valueOf(this.value));
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(this.value);
    }

    @Override
    public OperationsInterface sum(OperationsInterface ops) {
        return ops.SumedByInt(this);
    }

    @Override
    public OperationsInterface minus(OperationsInterface ops) {
        return ops.MinusedByInt(this);
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
        return new Float(Bops.ttFloat().getValue() + (float) this.getval()).ttBinary();
    }

    @Override
    public OperationsInterface SumedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() + (float) this.getval());
    }

    @Override
    public OperationsInterface SumedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Int(Iops.getval() + this.getval());
    }

    @Override
    public OperationsInterface MinusedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() - (float) this.getval()).ttBinary();
    }

    @Override
    public OperationsInterface MinusedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() - (float) this.getval());
    }

    @Override
    public OperationsInterface MinusedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Int(Iops.getval() - this.getval());
    }

    @Override
    public OperationsInterface MultedByBinary(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() * (float) this.getval()).ttBinary();
    }

    @Override
    public OperationsInterface MultedByFloat(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() * (float) this.getval());
    }

    @Override
    public OperationsInterface MultedByInt(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Int(Iops.getval() * this.getval());
    }

    @Override
    public OperationsInterface BinaryDiv(OperationsInterface ops) {
        Binary Bops= (Binary) ops;
        return new Float(Bops.ttFloat().getValue() / (float) this.getval()).ttBinary();
    }

    @Override
    public OperationsInterface FloatDiv(OperationsInterface ops) {
        Float Fops= (Float) ops;
        return new Float(Fops.getValue() / (float) this.getval());
    }

    @Override
    public OperationsInterface IntDiv(OperationsInterface ops) {
        Int Iops= (Int) ops;
        return new Int(Iops.getval() / this.getval());
    }

    @Override
    public OperationsInterface SumedByString(OperationsInterface ops) {
        String Sops= (String) ops;
        return new String(Sops.toString() + java.lang.String.valueOf(this.getval()));
    }
}
