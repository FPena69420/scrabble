package cl.uchile.dcc.scrabble.gui.tarea1;

public class String implements TypesInterface{
    java.lang.String value;

    public String(java.lang.String value){
            this.value= value;
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
