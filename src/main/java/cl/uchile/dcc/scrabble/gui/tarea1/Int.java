package cl.uchile.dcc.scrabble.gui.tarea1;

import java.util.Objects;

public class Int extends Num implements TypesInterface{
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
        else{
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
        return new Float(this.value);
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

}
