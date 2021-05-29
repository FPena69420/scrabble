package cl.uchile.dcc.scrabble.gui.tarea1;

public class Bool implements TypesInterface{
    boolean value;

    Bool(boolean value){
            this.value= value;
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
