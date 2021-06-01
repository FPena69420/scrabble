package cl.uchile.dcc.scrabble.gui.tarea1;

import java.util.Objects;

public class Float extends Num implements TypesInterface, OperationsInterface{
    float value;

    Float (float value) {
        this.value= value;
    }

    float getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Float.class, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Float) {
            var o= (Float) obj;
            return value== o.value;
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
        if (this.value>= 0){
            Int = new Int((int) Math.floor((double) this.value));
        }
        else{
            Int= new Int((int) Math.ceil((double) this.value));
        }
        float decimal= Math.abs(value % 1);
        return new Binary(Int.ttBinary().toString() + DecimalToBinary(decimal));
    }

    @Override
    public String ttString() {
        return new String(java.lang.String.valueOf(this.value));
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(this.value);
    }


}
