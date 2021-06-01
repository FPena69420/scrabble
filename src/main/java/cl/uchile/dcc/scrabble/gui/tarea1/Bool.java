package cl.uchile.dcc.scrabble.gui.tarea1;

import java.util.Objects;

public class Bool implements TypesInterface, LogicTheGathering{
    boolean value;

    Bool(boolean value){
        this.value= value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Bool.class, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bool) {
            var o= (Bool) obj;
            return value== o.value;
        }
        else{
            return false;
        }
    }

    @Override
    public Bool ttBool(){
        return this;
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
        return new String(java.lang.String.valueOf(this.value));
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(this.value);
    }


}
