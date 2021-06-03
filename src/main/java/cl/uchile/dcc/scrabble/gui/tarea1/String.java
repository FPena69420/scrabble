package cl.uchile.dcc.scrabble.gui.tarea1;

import java.util.Objects;

public class String implements TypesInterface/*, OperationsInterface */{
    java.lang.String value;

    public String(java.lang.String value){
        this.value= value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(String.class, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String) {
            var o= (String) obj;
            return value.equals(o.value);
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
        return this.value;
    }


}
